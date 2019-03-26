package com.byardley

class Surgery {
String name
String address
String postcode
String telephone 
String numberOfPatients 
String description
Float openingTime
Float closingTime
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
openingTime scale:2
openingTime min:9.00F
openingTime max: 12.00F
closingTime min: 17.00F
closingTime mac: 19.00F




    }
}
