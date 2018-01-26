# A Formalization of the IHE Process

The Integrating the Healthcare Enterprises, IHE, http://www.ihe.net, established a process to pragmatically and securely achieve enterprise IT interoperability. The process ranges from business-oriented high-level system design and culminates in the verification of vendor solutions conformance. We formalized a solution design methodology that is somehow embedded in the process, and formalize it with the intent to ease dependency management, enable design automation and provide provably correct solutions. 

## The Process

IHE consists of Building Blocks named Integration Profiles which aim at solving a specific clinical use case by means of one or more
transactions. Vendors implement actors and transactions and go to special events named _connectathons_ to test for conformance and interoperability. After connectathons, products are listed in a public registry (see https://ihe.net/IHE_Product_Registry/) where
project coordinators can select the appropriate vendors for conformance with a specific Profile. 

A typical e-Health project is created by matching the use cases with the clinical use case that each profile solves. By _grouping_ profiles (i.e., merging the functionalities of each of them), additional profiles are created ready to be used, recursively. At the end of the process, the IT architecture "emerges" from the correlations among those building blocks selected by the architect and those who have a _mandatory_ grouping with others. In this project we gave a syntax to the actors and transactions (to avoid the use of english prosa) and we formalized the profile grouping function and the _mandatory grouping_ which we call "TF Rules". 


## The syntax
The syntax of the IHE process is defined in the following picture.

![The syntax of the IHE Process](http://www.mascanc.net/syntax.png)

We start by identifying an architectural element (e.g., a Technical Framework like IT Infrastructure, Eye care) which is composed by one or more profiles (e.g., XDS, PIX). Each profile has actors, transactions, domains, quality attributes, and a specific function (will be clarified later). As example, the Consistent Time profile from the IHE TF Vol1 is rendered as follows

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
        }

To express a grouping rule with another profile, we use, e.g., `time2 : "*/PIX->TimeClient/CT"`. Using this notation we express that _any actor implementing the PIX profile shall be grouped with the TimeClient actor for CT_.

We provided a semantics in a denotational style and we implemented it. The outcome of the encoding is a set of Java classes that enables the analysis and the automatic construction of solution architecture.

As example, after selecting the relevant profiles matching the use cases with the clinical use cases for each profile, the architect could use our tool to automate the creation of the solution architecture by applying the TF Rules accordingly. The resulting list of actors, transactions, and profiles can subsequently applied recursively to more architectures. The Java implementation of the IHE TF Framework is as example under the directory `TgfiSample/src-gen/com/spirit/ihe/iti`. 

Quality attributes resutling in the compilation of the IHE Process could be further refined by the architect, and evaluated automatically by a tool. By expressing them in SMT-LIB, any tool like Z3 could interpret them and provide formal guarantees that the solution architecture fulfills the quality attribute required by the customer. 

## Applying the process to TOGAF and SGAM

The IHE process has been executed in healthcare since 17 years worldwide, and almost all e-Health projects relies on the IHE profiles. 
We believe that this process can be applied to other sectors successfully. We applied the process to a TOGAF-like architecture and to the SGAM (Smart Grid Architectural Model) in e-Government (throught the http://www.e-sens.eu with application to the ISA EIRA https://joinup.ec.europa.eu/solution/eira) and to Energy (using the technical framework provided by http://www.iesaustria.at). We believe that the IHE process could leverage the sustainability given by the TOGAF approach, and by the selection and use case representation from the SGAM. Viceversa, the SGAM and the EIRA could benefit from the IHE process by creating emerging solution architecture just running the grouping function, and further formally analyzing with Z3. This is in particular true for the SGAM in which the BAP must not have options. There will be many BAPs to choose from, and thus an automatic tool like the one presented could ease the work of the IT architect in selecting and analyzing the best architecture for the system.

## Next steps
* Provide a full eclipse plugin
* Error check for missing profiles
* Create a library of BAPs for ISO61850
* Translate the solution architecture in SMT-LIB


### Author

**Helder Aranha** and
**Massimiliano Masi**

* [github/mascanc](https://github.com/mascanc)

