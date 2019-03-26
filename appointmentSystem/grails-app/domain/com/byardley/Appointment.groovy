package com.byardley

class Appointment {
Date appDate
Float appTime
int appDuration
String roomNumber
Patient patient
static hasMany=[surgerys:Surgery, doctors:Doctor]
static belongsTo=[Surgery, Doctor]
String toString(){
return appDate
}
    static constraints = {


appDate nullable:false
appDate blank:false
appTime nullable:false
appTime blank:false
appTime scale:2
appTime min: 9.00F
appTime max:16.45F
appDuration nullable:false
appDuration blank:false
appDuration inList:[15,30,45,60]
roomNumber nullable:false
roomNumber blank:false
patient nullable:false
patient blank:false
    }
}
