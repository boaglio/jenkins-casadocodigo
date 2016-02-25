<jsp:include page="cabecalho.jsp"/>
 <div class="jumbotron">
  <div class="container">
      <form class="form-signin" name='f' action="j_spring_security_check" method='POST'>
        <h2 class="form-signin-heading">Entrar no sistema</h2>
        <label for="username" class="sr-only">Email address</label>
        <input type="text" id="username" name="username"  class="form-control" placeholder="username" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>
  </div>
</div>
<jsp:include page="rodape.jsp"/>