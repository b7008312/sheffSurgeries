<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries Search</title>
</head>
<body>
<div class="row">
<h1>Sheffield Surgeries Search</h1>
<h3>Search Results</h3>
<p>
</br>
 Searched ${totalPatients} records
 for items matching <em>${term}</em>.
 Found <strong>${patients.size()}</strong> patients.
</br>
 </p>
 <ul>
 <g:each var="patient" in="${patients}">
</br>
</br>
</br>
 <li><g:link controller="Patient" action="show"
id="${patient.id}">${patient.patientName}</g:link></li>
</br>
 </g:each>
 </ul>
<button type="button" class="btn btn-success">
 <g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>
