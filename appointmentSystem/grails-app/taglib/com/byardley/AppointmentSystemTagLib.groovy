package com.byardley

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
def loginToggle = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){
out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"
out << "<a href='${createLink(controller:'receptionist', action:'logout')}'>"
out << "Logout Receptionist </a></span>"
}

else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'receptionist', action:'login')}'>"
out << "Login Receptionist</a></span>"
}
out << "</div><br/>"
}
def loginToggleDoc = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){
out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"
out << "<a href='${createLink(controller:'doctor', action:'logout')}'>"
out << "Logout Doctor </a></span>"
}

else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'doctor', action:'login')}'>"
out << "Login Doctor</a></span>"
}
out << "</div><br/>"
}


def showdetails = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){
out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"
out << "<a href='${createLink(controller:'patient', action:'index')}'>"
out << "Show Patients </a></span>"
}

else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'patient', action:'index')}'>"
out << "Show Patients</a></span>"
}
out << "</div><br/>"
}

}

