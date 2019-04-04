package com.byardley

class PrescriptionController {

    def scaffold = Prescription

def Search(){
}

def results(){
def prescripProps = Prescription.metaClass.properties*.name
def prescriptions = Prescription.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (prescripProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
 }
return [ prescriptions : prescriptions ]
}
}
