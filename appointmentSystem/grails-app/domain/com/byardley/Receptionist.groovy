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

recepName nullable:false
recepName blank:false
recepEmail blank:false
recepEmail nullable:false
recepUsername blank:false
recepUsername nullable:false
recepPassword blank:false
recepPassword nullable:false
recepPhone blank:false
recepPhone nullable:false
    }
}
