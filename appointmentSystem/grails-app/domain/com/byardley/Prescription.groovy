package com.byardley

class Prescription {
String pharmacyName
int prescripNumber
String medicine
String totalCost 
Date dateIssued
String patientPaying
String toString(){
return prescripNumber
}
    static constraints = {

pharmacyName nullable:false
pharmacyName blank:false
prescripNumber blank:false
prescripNumber nullable:false
medicine blank:false
medicine nullable:false
totalCost blank:false
totalCost nullable:false
dateIssued blank:false
dateIssued nullable:false
patientPaying blank:false
patientPaying nullable:false
    }
}
