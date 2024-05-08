/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-03 17:50:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modules.Baraja;
import modules.Carta;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Barajar Cartas</title>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Jaro:opsz@6..72&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("\n");
      out.write("          display: flex;\n");
      out.write("          justify-content: center;\n");
      out.write("          align-items: center;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #background-container {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-top: 186.5px; /* Ajusta según el tamaño de la imagen */\n");
      out.write("            background-image: url('./assets/img/tapete.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #centrar {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-family: 'Jaro', sans-serif;\n");
      out.write("            font-size: 50px;\n");
      out.write("            color: #333;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            width: 20%;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            font-family: 'Jaro', sans-serif;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"background-container\">\n");
      out.write("    <div id=\"centrar\">\n");
      out.write("        <h1>Cartas</h1>\n");
      out.write("\n");
      out.write("        ");

            Baraja barajaEsp = new Baraja();
            int i = 0;
            barajaEsp.inicializaBaraja();
            barajaEsp.barajar();
            do {
                Carta carta = barajaEsp.sacarCarta();
                Carta comprobacion;
                do {
                    comprobacion = barajaEsp.sacarCarta();
                    if(carta.equals(comprobacion)){
                        barajaEsp.barajar();
                    }
                } while (carta.equals(comprobacion));
                out.println(comprobacion);
                i++;
            } while (i < 4);
        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"index.jsp\" method=\"get\">\n");
      out.write("            <button type=\"submit\">Baraja!</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
