package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title>Authentification</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/css/ready.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"template/css/demo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("                 $(document).ready(function () {\n");
      out.write("     $(\"#log\").click(function () {\n");
      out.write("        var username = $(\"#username\").val();\n");
      out.write("        var password= $(\"#password\").val();\n");
      out.write("        alert(username);\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"LoginController\",\n");
      out.write("            data: {username:username,password:password},\n");
      out.write("            type: 'POST',\n");
      out.write("            success: function (data, textStatus, jqXHR) {\n");
      out.write("                remplir(data);\n");
      out.write("                console.log(data);\n");
      out.write("            },\n");
      out.write("            error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                console.log(textStatus);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    })\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("   \n");
      out.write("        <div class=\"container\" style=\"margin-left:500px\">\n");
      out.write("            <div class=\"row-card-no-pd\" >\n");
      out.write("                <div  style=\"margin-right:700px\" class=\"card-body\" >\n");
      out.write("                   <form  action=\"LoginController?op=log\"method=\"POST\"style=\"border:2px solid\" >\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h2>Authentification</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>UserName</label>\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\"clas=\"form-control\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\"clas=\"form-control\">\n");
      out.write("                                <input type=\"hidden\" name=\"op\"  value=\"log\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <button type=\"submit\" id=\"log\" class=\"btn btn-success\">Login in</button>\n");
      out.write("                            </div></fieldset>\n");
      out.write("                       \n");
      out.write("                    </form>\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
