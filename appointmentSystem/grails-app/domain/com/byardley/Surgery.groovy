package com.byardley

class Surgery {
String name
String address
String postcode
String telephone 
String numberOfPatients 
String description
String openingTime
static hasMany=[doctors:Doctor, receptionists: Receptionist, nurses:Nurse, patients:Patient, appointments:Appointment]
String toString(){
return name
}
    static constraints = {

name nullable:false
name blank:false
address blank:false
address nullable:false
postcode blank:false
postcode nullable:false
telephone blank:false
telephone nullable:false
numberOfPatients blank:false
numberOfPatients nullable:false
description blank:false
description nullable:false
openingTime blank:false
openingTime nullable:false
    }
}
