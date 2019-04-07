<!doctype html>
<html>
<head>
<style>
body {
  background-color: lightblue;
}

h1 {
  color: white;

}

p {
  font-family: verdana;
  font-size: 15px;
}

</style>
    <meta name="layout" content="mainDoctor"/>
    <title>Welcome to Sheffield Surgeries | HomePage</title>
</head>
<body>




	<div id="content" role="mainDoctor">
		<div class="column">
			<div class="second">
				<h3>Appointment Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Appointment" action="index">List Appointment</g:link>
				</button>
				
			</div>
			<div class="first">
				<h3>Prescription Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Prescription" action="create">Add Prescription</g:link>
				</button>

			</div>
			<div class="second">
				<h3>List Nurses</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Nurse" action="index">List Nurse</g:link>
				</button>
			</div>
			<div class="first">
				<h3>List Patients</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="index">List Patient</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Search for medicine</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Prescription" action="Search">Search</g:link>
				</button>
			</div>
</div>
</div>
</body>
</html>


