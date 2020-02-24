package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>");
      out.print( request.getParameter("idnumber"));
      out.write("<p />\n");
      out.write("            ");
      out.print( request.getParameter("firstname"));
      out.write("<p />\n");
      out.write("            ");
      out.print( request.getParameter("lastname"));
      out.write("<p />\n");
      out.write("            ");
      out.print( request.getParameter("address"));
      out.write("<p />\n");
      out.write("            \n");
      out.write("</h1>\n");
      out.write("         \n");

           try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection conn= null;
           conn = DriverManager.getConnection("jdbc:odbc:myarc", "", "");
           

           out.println("");
           String query = "select * from studentinfo";
           Statement st = conn.createStatement();
           ResultSet rs= st.executeQuery(query);
           
          while(rs.next()){


      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("     <td>");
      out.print(rs.getString("StudentID"));
      out.write("</td> \n");
      out.write("     \n");
      out.write("     <td><!--dynamic link -->\n");
      out.write("         ");
      out.print(rs.getString("StudentFirstName"));
      out.write(" &nbsp;&nbsp;");
      out.print(rs.getString("StudentLastName"));
      out.write("&nbsp; &nbsp;&nbsp;<a href=\"viewone.jsp?id=");
      out.print(rs.getString("StudentID"));
      out.write("\">view </a></td>\n");
      out.write("     \n");
      out.write("     <td>");
      out.print(rs.getString(4));
      out.write("</td> \n");
      out.write("     \n");
      out.write("     <td><!--dynamic link -->\n");
      out.write("         <a href=\"edit.jsp\"> Edit </a> </td>\n");
      out.write("     \n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr> \n");
      out.write("\n");
      out.write("    <td colspan=\"5\">&nbsp;</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>     \n");
      out.write("    \n");


}//end of while

}//end of catch
catch (Exception ex){
 
      out.write("\n");
      out.write(" \n");
      out.write(" <font size=\"+3\" color=\"red\">\n");
      out.write(" ");

 out.println("Unable to connect to database.");
 }
 
      out.write("           \n");
      out.write("    \n");
      out.write(" </font>    \n");
      out.write("        \n");
      out.write("          \n");
      out.write("           \n");
      out.write("         \n");
      out.write("        \n");
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
