package com.byardley

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber
Patient patient
static hasMany=[doctors:Doctor]
static belongsTo=[Doctor]
String toString(){
return appDate
}
    static constraints = {


appDate nullable:false
appDate blank:false
appTime nullable:false
appTime blank:false
appDuration nullable:false
appDuration blank:false
roomNumber nullable:false
roomNumber blank:false
patient nullable:false
patient blank:false
    }
}
