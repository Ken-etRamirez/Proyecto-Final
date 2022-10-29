<%@ page import="dao.ResultadoDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Resultado" %>
<html>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <title>Historias</title>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>

<body>
  <nav>
    <div class="nav-wrapper #00796b teal darken-2">
      <a href="#" class="brand-logo">Aplicacion Web de Noticias</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="index.jsp">Inicio </a></li>
        <li><a href="contenido.jsp">Consultar Historias </a></li>
        <li><a href="top3.jsp">Top #3</a></li>
      </ul>
    </div>
  </nav>
  <br><br>



  <div class="row">
          <form class="col s12" method="post" action="busqueda.jsp">
              <button class="btn waves-effect waves-light" type="submit" name="action">Noticia Completa
                  <i class="material-icons right">ads_click</i>
              </button>
          </form>
  </div>

  <br><br>
      <table class="striped">
        <thead>
          <tr>
              <th>Id</th>
              <th>Title</th>
              <th>By Line</th>
          </tr>
        </thead>
        <tbody>
        <%
        ResultadoDAO resultadoDAO=new ResultadoDAO();
        List<Resultado> resultado= resultadoDAO.getAllDB();

        for(Resultado noticias:resultado){
        %>
          <tr>
            <td><%= noticias.getId() %></td>
            <td><%= noticias.getTitulo() %></td>
            <td><%= noticias.getByline() %></td>
          </tr>
          <%
          }
          %>
        </tbody>
      </table>


  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>

</html>