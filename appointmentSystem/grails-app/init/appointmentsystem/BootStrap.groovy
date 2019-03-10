package com.byardley

class BootStrap {

    def init = { servletContext ->
    

def CityCentre = new Surgery(
name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S115TY',
telephone: '0114555555',
numberOfPatients: '50',
description: 'Described',
openingTime: '9:00'
).save()

def SarahM = new Doctor(
fullName: 'Dr Sarah Macdonald',
qualification: 'MBChB(Sheffield)',
position: 'GP, Surgeon',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'Biography'
).save()

def TomR = new Patient(
patientName: 'Tom Rivers',
patientAddress: '2 One Way Street',
patientResidence: 'Sheffield, Barnsley, Doncaster',
patientDob: new Date('20/09/1998'),
patientID: 'E25555',
dateRegistered: new Date('26/02/2018'),
patientPhone: '01142224444'
).save()

def RobK = new Receptionist(
recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '01142224445'
).save()

def SusanP = new Nurse(
nurseName: 'Susan Peters',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '01142224443'
).save()

def App1 = new Appointment(
appDate: new Date('2019/04/11'),
appTime: '3pm',
appDuration: '60',
roomNumber: 'A-1111'
).save()

def Prescrip1 = new Prescription(
pharmacyName: 'City Centre Pharmacy',
prescripNumber: '56788',
medicine: 'Paracetamol',
totalCost: '£5.90',
dateIssued: new Date('2019/05/25'),
patientPaying : 'Yes'
).save()

















}
    def destroy = {
    }
}
