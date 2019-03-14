package com.byardley

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice 
String nursePhone
static hasMany=[surgerys:Surgery, doctors:Doctor]
static belongsTo=[Surgery, Doctor]
String toString(){
return nurseName
}
    static constraints = {

nurseName nullable:false
nurseName blank:false
qualifications blank:false
qualifications nullable:false
nurseEmail blank:false
nurseEmail nullable:false
nurseEmail email:true
nurseOffice blank:false
nurseOffice nullable:false
nursePhone blank:false
nursePhone nullable:false
    }
}
