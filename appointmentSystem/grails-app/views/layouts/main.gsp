<!doctype html>
<html lang="en" class="no-js">
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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<div class="row">
	<asset:image src="surgery1.jpg"/>
<g:loginToggle />
<g:loginToggleDoc />
</div>
<g:layoutBody/>
	





<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
