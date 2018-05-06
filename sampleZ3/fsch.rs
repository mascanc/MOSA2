(set-option :print-success false)
(set-option :produce-models true) 
(set-option :produce-proofs true)


;
; Definitions of the constants for the profiles. Those are the attributes
; for the quality_attributes
;
(echo "Declaring the quality attributes of Profile MMXU")


(echo "Declaring mmxu_read_seconds_eth")
(define-fun mmxu_read_seconds_eth () Int 200)


(echo "Declaring mmxu_read_seconds_dsl")
(define-fun mmxu_read_seconds_dsl () Int 400)

(echo "Declaring the quality attributes of Profile ENA")
(echo "Declaring ena.hw.hs")
(define-fun ena.hw.hs () Int 3000)

(echo "Declaring ena.sw.hs")
(define-fun ena.sw.hs () Int 1000)


(echo "Declaring the quality attributes of Profile FSCH")
(echo "Declaring fsch_write_sec_eth")
(define-fun fsch_write_sec_eth () Int 30)

(echo "Declaring fsch_read_sec_eth")
(define-fun fsch_read_sec_eth () Int 70)

(echo "Declaring fsch_write_sec_dsl")
(define-fun fsch_write_sec_dsl () Int 40)

(echo "Declaring fsch_read_sec_dsl")
(define-fun fsch_read_sec_dsl () Int 20)

;
; Definition of the goal. Is our architecture capable of doing x reads per second?
;

(echo "Declaring the GOAL")
(declare-fun secure_reads_per_second () Int)

;
; Algorithms. We put in OR the quality attributes, and we AND the overall
;
(echo "Declaring the algorithms")
(define-fun throughput_mmxu_read() Bool(
    or (> mmxu_read_seconds_eth secure_reads_per_second) (> mmxu_read_seconds_dsl secure_reads_per_second)
))

(define-fun throughput_ena_read() Bool(
    or (> ena.hw.hs secure_reads_per_second) (> ena.sw.hs secure_reads_per_second)

))

(define-fun throughput_fsch_read() Bool(
    or (> fsch_read_sec_eth secure_reads_per_second) (> fsch_read_sec_dsl secure_reads_per_second)

))

;
; Declaring the Overall function
;


(define-fun throughput_total() Bool(
    and throughput_mmxu_read throughput_fsch_read throughput_ena_read
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


