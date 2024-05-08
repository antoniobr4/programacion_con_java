<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<% 
  //Conectamos con la BBDD
  Connection conexion = Conexion  .getConexion("ccaa");
  Statement consulta = conexion.createStatement();
  ResultSet resultado = consulta.executeQuery("SELECT * FROM ccaa");
  out.println("BORRANDO PROVINCIA CON CLAVE PRIMARIA codProv = " `+ request.getParameter("cod"));
%>