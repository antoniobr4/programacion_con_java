/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-09 19:06:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modules.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class insertarProvincia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <title>PROYECTO PROVINCIAS</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    ");
 
      if(request.getParameterMap().size() == 1) {
        out.println("Nº parametros enciados en la peticion HTTP: " + request.getParameterMap().size());
      
    
      out.write("\r\n");
      out.write("    <form>\r\n");
      out.write("      <imput type=\"hidden\" name=\"ccaa\" value=\"");
      out.print( request.getParameter("ccaa") );
      out.write("\" />\r\n");
      out.write("      <label for=\"prov\">Introduce provincia:</label>\r\n");
      out.write("      <imput type=\"text\" id=\"prov\" name=\"prov\" autofocus required/>\r\n");
      out.write("      <button>Guardar</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    ");
 } else {
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
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
