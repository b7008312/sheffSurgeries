package com.byardley

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob 
String patientID 
Date dateRegistered
String patientPhone
static hasMany=[prescriptions:Prescription, doctors:Doctor, surgerys:Surgery]
static belongsTo=[Surgery]
String toString(){
return patientName
}
    static constraints = {

patientName nullable:false
patientName blank:false
patientAddress blank:false
patientAddress nullable:false
patientResidence blank:false
patientResidence nullable:false
patientDob blank:false
patientDob nullable:false
patientID blank:false
patientID nullable:false
dateRegistered blank:false
dateRegistered nullable:false
patientPhone blank:false
patientPhone nullable:false

    }
}
