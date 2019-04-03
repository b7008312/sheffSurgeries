package com.byardley

class ReceptionistController {

    def scaffold = Receptionist
def Search(){
}
def results(String patientName){
def patients=Patient.where{
patientName=~name
}.list()
return [patients:patients,
term:params.patientName,
totalPatients: Patient.count()]
}

def login(){
}

	def validate(){
	def user = Receptionist.findByRecepUsername(params.recepUsername)
		if(user && user.recepPassword == params.recepPassword){
			session.user = user
			render view:'home'
		}
		else{
			flash.message="invalid username and password"
			render view:'login'
			}

	}

def logout = {
	session.user=null
	redirect(uri:'/')
	}
}
