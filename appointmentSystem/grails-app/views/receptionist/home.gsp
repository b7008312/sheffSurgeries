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
    <meta name="layout" content="mainRecep"/>
    <title>Welcome to Sheffield Surgeries | HomePage</title>
</head>
<body>



	<div id="content" role="mainRecep">
		<div class="column">
			<div class="second">
				<h3>Patient Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="create">Add Patient</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Doctor Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Doctor" action="create">Add Doctor</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Receptionist Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Receptionist" action="create">Add Receptionist</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Nurse Management</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Nurse" action="create">Add Nurse</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Nurse List</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Nurse" action="index">List Nurse</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Patient List</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="index">List Patient</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Search</h3>
				
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="Search">Search For Patient</g:link>
				</button>
			</div>
</div>
</div>
</body>
</html>


