<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
 <head>
  <title>Minhas Moedas</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
 </head>
<body>
    <nav class="navbar navbar-inverse">
      <div class="container">
        <div class="navbar-header">
         <a href="#" class=" navbar-brand">
         <img src="${pageContext.request.contextPath}/img/dimdim.png"/>Minhas Moedas
         </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <sec:authorize access="isAnonymous()">
             <li><a href="<c:url value="/" />">Home</a></li>
             <li><a href="${pageContext.request.contextPath}/sobre">Sobre</a></li>
             <li><a href="${pageContext.request.contextPath}/entrar">Entrar</a></li>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
             <li><a href="${pageContext.request.contextPath}/cambio">C&acirc;mbio de hoje</a></li>
             <li><a href="${pageContext.request.contextPath}/sair">Sair</a></li>
            </sec:authorize>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    <br/><br/><br/>
    <div class="container">