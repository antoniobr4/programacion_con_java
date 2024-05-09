<%-- @author Antonio Bravo --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>PROYECTO PROVINCIAS</title>
  </head>
  <body>

    <% 
      if(request.getParameterMap().size() == 1) {
        out.println("Nº parametros enciados en la peticion HTTP: " + request.getParameterMap().size());
      
    %>
    <form>
      <imput type="hidden" name="ccaa" value="<%= request.getParameter("ccaa") %>" />
      <label for="prov">Introduce provincia:</label>
      <imput type="text" id="prov" name="prov" autofocus required/>
      <button>Guardar</button>
    </form>
    
    <% } else {
      request.setCharacterEncoding("UTF-8");

      //Preparamos la consulta INSERT
      String nombreProvincia = request.getParameter("prov");
      //Recordad que request.getParameter SIEMPRE devuelve un STRING
      String codCCAA = request.getParameter("ccaa");

      //Redactamos consulta SQL
      String sql = "INSERT INTO provincia(codCCAA, nomProv) " + 
                    "VALUES (" + codCCAA + ", '" + nombreProvincia + "');" ;

      
      //Conectamos con la BBDD
      Connection conexion = Conexion.getConexion("ccaa");
      Statement consulta = conexion.createStatement();

      //Ejecutamos la consulta
      consulta.execute(sql);

      //Cerramos la conexion
      conexion.close();

      //Redirigimos al index
      response.sendRedirect("http://localhost:8080/provincias");
    }
    %>

  </body>
</html>
    