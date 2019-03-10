package com.byardley

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword 
String recepPhone
static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]
String toString(){
return recepName
}
    static constraints = {
    }
}
