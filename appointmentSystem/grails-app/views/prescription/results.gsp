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
 Searched ${totalPrescriptions} records
 for items matching <em>${term}</em>.
 Found <strong>${prescriptions.size()}</strong> prescriptions.
</br>
 </p>
 <ul>
 <g:each var="prescription" in="${prescriptions}">
</br>
</br>
</br>
 <li><g:link controller="Prescription" action="show"
id="${prescription.id}">${prescription.medicine}</g:link></li>
</br>
 </g:each>
 </ul>
<button type="button" class="btn btn-success">
 <g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>
