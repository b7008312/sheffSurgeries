package com.byardley

class PatientController {

    def scaffold = Patient
def Search(){
}

def results(){
def patientProps = Patient.metaClass.properties*.name
def patients = Patient.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (patientProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
 }
return [ patients : patients ]
}
}
