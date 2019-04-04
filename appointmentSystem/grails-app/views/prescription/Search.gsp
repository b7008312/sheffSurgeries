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
<legend>Search for Prescriptions(Simple)</legend>
<table>
 <g:form action="results">
<tr>
 <td>Medicine</td>
 <td><g:textField name="Medicine" /></td>
 </tr>
<tr>
 <td>Days of Supply</td>
 <td><g:textField name="daysSupply" /></td>
 </tr>
<tr>
 <td>Total Cost</td>
 <td><g:textField name="totalCost" /></td>
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
