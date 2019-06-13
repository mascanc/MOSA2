# A Formalization of the IHE Process

The Integrating the Healthcare Enterprises, [IHE](http://www.ihe.net), established a process to pragmatically and securely achieve enterprise IT interoperability. The process ranges from business-oriented high-level system design and culminates in the verification of vendor solutions conformance. We formalized a solution design methodology that is somehow embedded in the process, and formalize it with the intent to ease dependency management, enable design automation and provide provably correct solutions. 

## The Process

IHE consists of Building Blocks named Integration Profiles which aim at solving a specific clinical use case by means of one or more
transactions. Vendors implement actors and transactions and go to special events named _connectathons_ to test for conformance and interoperability. After connectathons, products are listed in a public registry (see [IHE Product Registry](https://ihe.net/IHE_Product_Registry/)) where
project coordinators can select the appropriate vendors for conformance with a specific Profile. 

A typical e-Health project is created by matching the use cases with the clinical use case that each profile solves. By _grouping_ profiles (i.e., merging the functionalities of each of them), additional profiles are created ready to be used, recursively. At the end of the process, the IT architecture "emerges" from the correlations among those building blocks selected by the architect and those who have a _mandatory_ grouping with others. In this project we gave a syntax to the actors and transactions (to avoid the use of english prosa) and we formalized the profile grouping function and the _mandatory grouping_ which we call "TF Rules". 

We provided a formal account of such process. We firstly introduce the IHE language and its syntax, and then we sketch its semantics. 

The language is implemented in Java, and provides extension points to be further evaluated. 

## Using the language
Design software architectures should not be part of an naive inspiration (the architect is not a poet, cit.), but it should be disciplined and repeatable, to have further evaluation ex-ante (i.e., before the deployment or even the implementation of the software), and ex-post (i.e., being software assets, also architectures need constant monitoring and refactoring). We want to assist the architect in that means: we provide a formal language to express architectural assets and a formal process to build the architecture, allowing external reviews, and providing an automatic tool that re-evaluates the refactored architecture to check if it is compliant with a given policy (coming, e.g., from a customer). In particular, security concerns, are always poorly evaluated (for instance, because there is a scarcity of security professionals). Our proposal embraces the [RMIAS](http://rmias.cardiff.ac.uk/) model to continuos improve and validate compliance with a given security policy set (of security policies).

Each profile has one or more **merging rules**, defining which other profiles are needed in order to achieve a given functionality. Additional rules are added by the architect to fulfill the need of the architecture.  The following picture (see, IHE ITI TF Vol1, Figure 2-1) shows the profiles and their respective rules (the arrows) for some of the IHE ITI profiles. 

![IHE Basic Merging Rules](http://www.mascanc.net/vol21.png)


1. The architect starts by defining the _building blocks (BB)_, or use a library. For instance, the IHE technical framework provides building blocks used in healthcare projects [worldwide](https://www.google.com/maps/d/viewer?ie=UTF8&hl=en&oe=UTF8&msa=0&source=embed&ll=-3.81666561775622e-14%2C155.390625&spn=138.013795%2C352.265625&z=1&mid=1wx3-Ye3zDFPl0r6wU2OvxtcObc0), while [IES](http://iesaustria.at) provides building blocks to establish the Smart Grid, or the [Connecting the European Facility, CEF](https://ec.europa.eu/cefdigital/wiki/display/CEFDIGITAL2018/About+CEF+building+blocks), providing building blocks to implement eServices in Europe (provided by the European Commission). 
2. The architects adds to the existing BB catalogue the BBs created for a new project (if applicable)
3. The profiles which tackles security concerns are equipped with a list of values according with the RMIAS model, and quality attributes are either already available or added.
4. The architect calls the Grouping function to automatically create the solution architecture which emerge by applying the merging rules

The following picture shows the interactions amongst the profiles of IHE. We see the centrality of ATNA and CT. The picture is obtained executing `TestITI.java` under the `test` directory. 

![ATNA rule](http://www.mascanc.net/atna.png)



After step 4, the grouping rule returns a newly created profile (which can be, recursively, used to build additional architectures) which represents the solution architecture. At this step, the quality attributes may be further formally evaluated with a theorem prover  (e.g. we use [Z3](https://github.com/Z3Prover/z3)). In this way, Z3 is used to find a path for a given goal, to prove _formally_, if a given architecture supports some specific requirements. 
As example imagine to have two profiles P1, and P2. P1 guarantees a throughput of 300 messages per seconds, while P2 only 200 in scenario A, or 400 in scenario B, and the customer requires 290 messages per second. In complex architectures it is not obvious to formally prove that scenario B _always_ holds. Our solution systematically proves that the architecture can support the requirement.

We  adopted  a  commonly  agreed  model  of  information
security  as  the  base  security  model:  the  Reference
Model for Information Assurance and Security ([RMIAS](http://rmias.cardiff.ac.uk/)).
RMIAS identifies the following security aspects (dimensions)
of an Information System: Life Cycle, Information Taxonomy
(Classification), Security Goals and Countermeasures. RMIAS
supports mainly goal-based security management, as opposed
to threat-based security management. Threat-based models are
applicable mainly to live systems, requiring statistical data on
the  real  concrete  threats  as  experienced  by  such  systems.  A
goal-based oriented model better suits the aim of incorporating
security concerns early on in systems architecture, ie
security-by-design.
Focusing  on  goals  allows
security experts to communicate with other stakeholders using
concepts that do not require technical knowledge. The grouped profile at the end of the process contains the necessary attributes to be further evaluated to apply the RMIAS. 




What makes this language different from the many existing? Our language implements the IHE process, as describe above. However it could be applicable for all the architecture models given in a modular style, such as [RAMI](https://ec.europa.eu/futurium/en/system/files/ged/a2-schweichhart-reference_architectural_model_industrie_4.0_rami_4.0.pdf) for the Industrial IoT (also known as Industry 4.0), or the [SGAM](https://de.wikipedia.org/wiki/Smart_Grid_Architecture_Model) for the Smart Electricity Grid. 


## The syntax
The syntax of the IHE process is defined in the following picture.

![The syntax of the IHE Process](http://www.mascanc.net/syntaxihe.png)

Where the security requirements 

![The syntax of the IHE Process](http://www.mascanc.net/secre.png)

We start by identifying an architectural element (e.g., a Technical Framework like IT Infrastructure, Eye care) which is composed by one or more profiles (e.g., XDS, PIX). Each profile has actors, transactions, domains, quality attributes, and a specific function (will be clarified later). As example, the Consistent Time profile from the IHE TF Vol1 is rendered as follows

```    
Profile CT {
	Name: "CT"
	Description: "Defines a mechanism to synchronize the time base between multiple actors and computers"
	Features: "Keep time in sync, using NTP"
	Function: "Consistent time"

	actors:
	    "TimeClient"
	    "TimeServer"
	transactions:
	    ("TimeClient", "ITI_1_Maintain_Time", "TimeServer")
	domains:
	    "Infrastructure"
	quality_attributes:
		ct1: "drift(1msec)"
	security_requirement:
	    sct1: {
	      Form: "Electronic"
	      Sensitivity: "Public"
	      Location: "Any"
	      Goal: "Maintain Time"
	      State: "Transmission"
	      Descr: "Maintain Time using NTP"
	      Category: "Time Synchronization"
	    }
}
```  
To express a grouping rule with another profile, we use, e.g., `time2 : "*/PIX->TimeClient/CT"`. Using this notation we express that _any actor implementing the PIX profile shall be grouped with the TimeClient actor for CT_.

We provided a semantics in a denotational style and we implemented it. The outcome of the encoding is a set of Java classes that enables the analysis and the automatic construction of solution architecture.

As example, after selecting the relevant profiles matching the use cases with the clinical use cases for each profile, the architect could use our tool to automate the creation of the solution architecture by applying the TF Rules accordingly. The resulting list of actors, transactions, and profiles can subsequently applied recursively to more architectures. The Java implementation of the IHE TF Framework is as example under the directory `Samples`. 

Quality attributes resutling in the compilation of the IHE Process could be further refined by the architect, and evaluated automatically by a tool. By expressing them in SMT-LIB, any tool like Z3 could interpret them and provide formal guarantees that the solution architecture fulfills the quality attribute required by the customer. 

This is ascreenshot of the IDE (using xText and xTend)

![Editing lihe](http://www.mascanc.net/ide.png)

A sample execution of the test `TestCentralRegistry` (available under the `Language` directory) is as follows. 

```
GROUP: adding Name: CLINIC Actors:  ContentCreator ContentConsumer ContentRecipient
GROUP: resolving dependency
Going to resolve dependency on ABB named CLINIC
For actors: 
   ContentCreator
   ContentConsumer
   ContentRecipient
For rules: 
   */XDS->SN/ATNA
   */Clinic->XServiceUser/XUA
   */Clinic->SN/ATNA
   */ExtSource->SN/ATNA
Evaluating rule [*/XDS->SN/ATNA] with actor ContentCreator and profile CLINIC
Evaluating rule [*/Clinic->XServiceUser/XUA] with actor ContentCreator and profile CLINIC
Evaluating rule [*/Clinic->SN/ATNA] with actor ContentCreator and profile CLINIC
Evaluating rule [*/ExtSource->SN/ATNA] with actor ContentCreator and profile CLINIC
GROUP: resolved 0 dependencies
GROUP: adding Name: XDS Actors:  Consumer Source Registry Repository
GROUP: resolving dependency
Going to resolve dependency on ABB named XDS
For actors: 
   Consumer
   Source
   Registry
   Repository
For rules: 
   */XDS->SN/ATNA
   */Clinic->XServiceUser/XUA
   */Clinic->SN/ATNA
   */ExtSource->SN/ATNA
Evaluating rule [*/XDS->SN/ATNA] with actor Consumer and profile XDS
Rule matches!
Going to resolve dependency on ABB named ATNA
For actors: 
   SN
   ARR
For rules: 
   */XDS->SN/ATNA
   */Clinic->XServiceUser/XUA
   */Clinic->SN/ATNA
   */ExtSource->SN/ATNA
Evaluating rule [*/XDS->SN/ATNA] with actor SN and profile ATNA
Evaluating rule [*/Clinic->XServiceUser/XUA] with actor SN and profile ATNA
Evaluating rule [*/Clinic->SN/ATNA] with actor SN and profile ATNA
Evaluating rule [*/ExtSource->SN/ATNA] with actor SN and profile ATNA
ABB To return: null
Evaluating rule [*/Clinic->XServiceUser/XUA] with actor Consumer and profile XDS
Evaluating rule [*/Clinic->SN/ATNA] with actor Consumer and profile XDS
Evaluating rule [*/ExtSource->SN/ATNA] with actor Consumer and profile XDS
GROUP: resolved 1 dependencies
Resolved dependency Name: ATNA Actors:  SN ARR for ABB Name: XDS Actors:  Consumer Source Registry Repository
Evaluating quality attributes
Recursively calling group(XDS,ATNA)
GROUP: adding Name: EXTSOURCE Actors:  ContentCreator ContentRecipient
GROUP: resolving dependency
Going to resolve dependency on ABB named EXTSOURCE
For actors: 
   ContentCreator
   ContentRecipient
For rules: 
   */XDS->SN/ATNA
   */Clinic->XServiceUser/XUA
   */Clinic->SN/ATNA
   */ExtSource->SN/ATNA
Evaluating rule [*/XDS->SN/ATNA] with actor ContentCreator and profile EXTSOURCE
Evaluating rule [*/Clinic->XServiceUser/XUA] with actor ContentCreator and profile EXTSOURCE
Evaluating rule [*/Clinic->SN/ATNA] with actor ContentCreator and profile EXTSOURCE
Evaluating rule [*/ExtSource->SN/ATNA] with actor ContentCreator and profile EXTSOURCE
GROUP: resolved 0 dependencies
Assembling the ABB
Hit ENTER

   _______________________________________________________________________________________________________________________________________________________________________________________
   | ID    | Form      | Sensitivity  | Location            | State       | Goal          | Description                                         | Category                                |
   |======================================================================================================================================================================================|
1. | es1   | Electronic| Confidential | Partially Controlled| Transmission| Authentication| Authenticate the user who is submitting the document| Data integrity transfer protection      |
2. | xds1  | Electronic|              | Any                 |             |               |                                                     |                                         |
3. | satna2| Electronic| Confidential | Controlled          | Transmission| Accountability| rfc5424 syslog and DICOM PS A.5                     | Accountability                          |
4. | satna1| Electronic| Condfidential| Controlled          | Transmission|               | TLS Channels                                        | Data confidentiality transfer protection|
5. | prtl1 | Electronic| Confidential | Controlled          | Transit     | Authentication| The portal authenticates user via a login screen    | User Authentication                     |
6. |       |           |              |                     |             |               |                                                     |                                         |


```

For instance, if a security policy states "All the Authentication means shall be level 2 (Strong)". A projection on this table `WHERE Goal='Authentication' AND Level<2` returns 1 row, the 4th, which is not fulfilling the policy. 

The security requirements can be accessed as 

```
groupedABB.getSecurityRequirements().stream().forEach(x -> {
	// evaluate x
});

```
where `groupedABB` is the result of Group. See the tests provided for more information.
The architect is left free to evaluate the security requirements as he wants. We provided in our technical report a gamma notation (which is inspired by the relational algebra).  

### Evaluating with Z3
Quality attributes can be further evaluated with Z3, as previously described. 
By defining the quality attributes in a format which can be evaluated in SMT-LIB, e.g., 

```
quality_attributes:
        pix1: "(define-fun pi.levenshtein.match_sec () Int 200)"
```
(in this example: the IHE PIX profile that can match up to 200 patients per seconds using the Levenshtein algorithm) quality attributes are declared as _constants_. Once the database of quality attribute is defined, the architect could further evaluate the goal matching the customer's requests, e.g., 

```
;
; Definition of the goal. Is our architecture capable of doing x reads per second?
;

(echo "Declaring the GOAL")
(declare-fun secure_reads_per_second () Int)

;
; Algorithms. We put in OR the quality attributes, and we AND the overall
;
(echo "Declaring the algorithms")
(define-fun throughput_pi_read() Bool(
    or (> pi.levenshtein.match_sec secure_reads_per_second) (> pi.soundex.match_sec secure_reads_per_second)
))

(define-fun throughput_sr_read() Bool(
    or (> sr.hw.hs secure_reads_per_second) (> sr.sw.hs secure_reads_per_second)

))

(define-fun throughput_ds_read() Bool(
    or (> ds.db.read.sec secure_reads_per_second) (> ds.fs.read.sec secure_reads_per_second)

))

;
; Declaring the Overall function
;


(define-fun throughput_total() Bool(
    and throughput_pi_read throughput_ds_read throughput_sr_read
))

;
; Adding the assertions to the stack. This is the main goal of the
; evaluation of the quality attributes: how many reads per second
;
(assert throughput_total)
(assert (and (> secure_reads_per_second 30) (< secure_reads_per_second 32)))


(echo "Checking satisifiability")

(check-sat)

(echo "The architecture supports the following value")
(get-value (secure_reads_per_second))
(get-proof)
(get-model)
(get-info :all-statistics)
``` 

A sample transcript is as follows. 

```
max@spirit6 ~/Documents/GitHub/TOGAFIHE/sampleZ3 $ z3 test.rs
Declaring the quality attributes of Profile PI
Declaring pi.levenshtein.match_score
Declaring pi.levenshtein.match_sec
Declaring pi.soundex.match_score
Declaring pi.soundex.match_sec
Declaring the quality attributes of Profile SR
Declaring sr.hw.hs
Declaring sr.sw.hs
Declaring the quality attributes of Profile DS
Declaring ds.db.write.sec
Declaring ds.db.read.sec
Declaring ds.fs.write.sec
Declaring ds.fs.read.sec
Declaring the GOAL
Declaring the algorithms
Checking satisifiability
sat
The architecture supports the following value
((secure_reads_per_second 31))
(error "line 92 column 10: proof is not available")
(model
  (define-fun secure_reads_per_second () Int
    31)
)
(:arith-assert-lower 1
 :arith-assert-upper 4
 :del-clause         3
 :final-checks       1
 :max-memory         1.10
 :memory             1.08
 :mk-bool-var        9
 :mk-clause          3
 :num-allocs         3468
 :num-checks         1
 :rlimit-count       354
 :time               0.01)
```

The transcript shows that the architecture supports the requirement of 30 and 32 reads per seconds. 

## Applying the process to TOGAF and SGAM

The IHE process has been executed in healthcare since 17 years worldwide, and almost all e-Health projects relies on the IHE profiles. 
We believe that this process can be applied to other sectors successfully. We applied the process to a TOGAF-like architecture and to the SGAM (Smart Grid Architectural Model) in e-Government (throught the http://www.e-sens.eu with application to the ISA EIRA https://joinup.ec.europa.eu/solution/eira) and to Energy (using the technical framework provided by http://www.iesaustria.at). We believe that the IHE process could leverage the sustainability given by the TOGAF approach, and by the selection and use case representation from the SGAM. Viceversa, the SGAM and the EIRA could benefit from the IHE process by creating emerging solution architecture just running the grouping function, and further formally analyzing with Z3. This is in particular true for the SGAM in which the BAP must not have options. There will be many BAPs to choose from, and thus an automatic tool like the one presented could ease the work of the IT architect in selecting and analyzing the best architecture for the system.

## Using the library
The system is still in development. Clone the repository and import the project in Eclipse (make sure to have xtext and xtend installed, I recommend using a DSL-distribution). After eclipse recognizes the nature of the project (Xtext nature), right click on the com.spirit.ihe project and Run As... -> Eclipse Application, and this should run the editor. Before make sure to have right clicked on the grammar file `IHE.xtext`, and Run As... -> Create Xtext artifacts. Edit the IHE file in the editor, and save it. In the `src-gen` it should have created the java source code for your architecture. 

Copy/Paste those generated package in a Java Project (I use a separate Eclipse) where the semantics project is available. Then you can check the `test` directory for further information. Specifically the `TestCentralRegistry` describes the steps used to evaluate the architecture. 

## Known Bugs
* Provide a full eclipse plugin
* Translate the solution architecture in SMT-LIB
* The profile name shall contain only [a-z][A-Z] characters

### Contacts

* [github/mascanc](https://github.com/mascanc)

