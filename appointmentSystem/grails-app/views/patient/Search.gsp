<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries Search</title>
</head>
<body>
<div class="row">
<h1>Reception Search Form</h1>
<formset>
<legend>Search for Patients(Simple)</legend>
<table>
 <g:form action="results">
<tr>
 <td>Patient Name</td>
 <td><g:textField name="patientName" /></td>
 </tr>
<tr>
 <td>patientID</td>
 <td><g:textField name="patientID" /></td>
 </tr>
<tr>
 <td>Residence</td>
 <td><g:textField name="residence" /></td>
 </tr>
<tr>
 <td>Query Type:</td>
 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 </g:radioGroup>
 </td>
 </tr>
 <tr>
 <td/>
 <td>
 <g:submitButton name="search" value="Search"/></td>
 </tr>
 </g:form>
 </table>
 </formset>
</div>
 </body>
</html>
