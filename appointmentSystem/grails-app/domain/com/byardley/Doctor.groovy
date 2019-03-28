package com.byardley

class Doctor {
String fullName
String qualification
String position
String doctorEmail 
String password 
String doctorOffice
String doctorPhone
String bio
static hasMany=[prescriptions:Prescription, appointments:Appointment, nurses:Nurse, patients:Patient, surgerys:Surgery]
static belongsTo=[Patient, Surgery, Prescription]
String toString(){
return fullName
}
    static constraints = {

fullName nullable:false
fullName blank:false
qualification blank:false
qualification nullable:false
position blank:false
position nullable:false
doctorEmail blank:false
doctorEmail nullable:false
password blank:false
password nullable:false
doctorOffice blank:false
doctorOffice nullable:false
doctorPhone blank:false
doctorPhone nullable:false
bio blank:false
bio nullable:false
    }
}
