package com.byardley

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice 
String nursePhone
static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]
String toString(){
return nurseName
}
    static constraints = {
    }
}
