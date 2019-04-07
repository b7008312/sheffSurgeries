<!DOCTYPE html>
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
        <meta name="layout" content="mainRecep" />
        <g:set var="entityName" value="${message(code: 'receptionist.label', default: 'Receptionist')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-receptionist" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-receptionist" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${receptionistList}" />

            <div class="pagination">
                <g:paginate total="${receptionistCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
