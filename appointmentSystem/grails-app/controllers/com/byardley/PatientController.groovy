package com.byardley

class PatientController {

    def scaffold = Patient
def Search(){
}
def results(String patientName){
def patients=Patient.where{
patientName=~patientName
}.list()
return [patients:patients,
term:params.patientName,
totalPatients: Patient.count()]
}
}
