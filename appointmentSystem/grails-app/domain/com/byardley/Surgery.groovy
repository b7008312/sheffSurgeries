package com.byardley

class Surgery {
String name
String address
String postcode
String telephone 
String numberOfPatients 
String description
String openingTime
static hasMany=[doctors:Doctor, receptionists: Receptionist, nurses:Nurse]
String toString(){
return name
}
    static constraints = {
    }
}
