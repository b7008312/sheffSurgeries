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
static hasMany=[surgerys:Surgery, prescriptions:Prescription, appointments:Appointment]
static belongsTo=[Surgery]
String toString(){
return fullName
}
    static constraints = {
    }
}
