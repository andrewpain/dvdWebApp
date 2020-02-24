<%-- 
    Document   : edit
    Created on : May 2, 2014, 12:44:06 PM
    Author     : andrew
--%>
<%@page import= "java.sql.*" %>
<%@ page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Hello World! this is edit
            <%=request.getParameter("id")%>
        </h1>
<%
    int sid =Integer.parseInt( request.getParameter("id"));
    try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection conn= null;
           conn = DriverManager.getConnection("jdbc:odbc:myarc", "", "");
           
%>
           
           
           
<%
           out.println("");
           String query = "select * from studentinfo where StudentID="+sid;
           Statement st = conn.createStatement();
           ResultSet rs= st.executeQuery(query);
           
          while(rs.next()){
              
%>
<form action="update.jsp" method="post">
                                               <input type="hidden" name="id" value = "<%=rs.getString("StudentID")%>" />
    <p> First Name:&nbsp; &nbsp;&nbsp;&nbsp;    <input type="text" name="firstname" value = "<%=rs.getString("StudentFirstName")%>" /> </p>
    <p> Last Name:&nbsp; &nbsp;&nbsp;&nbsp;    <input type="text" name="lastname"  value = "<%=rs.getString("StudentLastName")%>" /> </p>
    <p> Address:&nbsp;&nbsp;&nbsp;&nbsp;    <input type="text" name="address"   value = "<%=rs.getString("StudentAddress")%>" /> </p>
    <p> Degree:&nbsp;&nbsp;&nbsp;&nbsp;    <input type="text" name="degree" value = "<%=rs.getString("degree")%>" /> </p>
<input type="submit" name="Submit"  value=" Submit" />
    
</form>    
    
    <%

}
conn.close();
}
catch (Exception ex){
 %>
 
 <font size="+3" color="red">
 <%
 out.println("Unable to connect to database.");
 }
 %>           
 </font>    
    
</body>
</html>
