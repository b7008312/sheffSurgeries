package com.byardley

class PrescriptionController {

    def scaffold = Prescription

def Search(){
}
def results(String medicine){
def prescriptions=Prescription.where{
medicine=~medicine
}.list()
return [prescriptions:prescriptions,
term:params.medicine,
totalPrescriptions: Prescription.count()]
}
}

