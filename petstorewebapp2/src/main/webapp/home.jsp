<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--This is a JSP Page  --%>

<%!String printMessage(){
	 return "Hello To User";
} %> 

<%!String Location="Chennai"; %>

<%=printMessage() %>

<h3>
<%=Location%>
</h3>
<%@ include file="title.jsp" %>
<ul>
<%=new java.util.Date() %><br/>
Pet Hiring Cost <%=12*35+7 %><br/>
<%
   out.println("This is a petstore page");
   java.util.ArrayList<String> petStoreList=new java.util.ArrayList();
   petStoreList.add("Happy Pet Store");
   petStoreList.add("Rock Pet Store");
   petStoreList.add("Safe House Pet Store");
   petStoreList.add("Bony's Pet Store");
   for(String s:petStoreList)
   {
	   %>
	   
	   <li>
	 <%=s %>   
	 
	 
	  </li>
	 <% 
   }
%>
</ul>

<div style="width:400px;height:400px;background-color:beige">
    <form action='hellopet' method='post'>
         Enter Pet Store Name <br/>
         <input type='text' name='storeName'/><br/>
         Enter Address <br/>
          <input type='text' name='address'/><br/>
          <input type='submit'/>
    </form>

</div>














</body>
</html>