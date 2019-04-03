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
				<h3>Appointment Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Appointment" action="index">List Appointment</g:link>
				</button>
			</div>
			<div class="first">
				<h3>Prescription Management</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Prescription" action="create">Add Prescription</g:link>
				</button>
			</div>
			<div class="second">
				<h3>List Nurses</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Nurse" action="index">List Nurse</g:link>
				</button>
			</div>
			<div class="first">
				<h3>List Patients</h3>
				<p>Test</p>
				<button type="button" class="btn btn-success">
				<g:link controller="Patient" action="index">List Patient</g:link>
				</button>
			</div>
</div>
</div>
</body>
</html>


