<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Sheffield Surgeries | HomePage</title>
</head>
<body>



	<div id="content" role="main">
		<div class="row">
			<div class="second">
				<h3>Patient Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="create">Add Patient</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Doctor Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Doctor" action="create">Add Doctor</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Receptionist Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Receptionist" action="create">Add Receptionist</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Nurse Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Nurse" action="create">Add Nurse</g:link>
				</button>
			</div>
			<div class="second">
				<h3>Nurse List</h3>
				<p>Test</p>
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
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Receptionist" action="Search">Search</g:link>
				</button>
			</div>
</div>
</div>
</body>
</html>


