<%@page import="org.springframework.ui.Model" %>
<%@page import="com.rs.springmvccrud.dto.Student" %>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
	%>
 <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
        
        </tr>
        <% for (Student student : students) { %>
            <tr>
                <td><%= student.getId() %></td>
                <td><%= student.getName() %></td>
                <td><%= student.getEmail() %></td>
                 <td><%= student.getCourse() %></td>
                 <td>
                    <a href="<c:url value='/edit.jsp'/>?id=${student.id}">Edit</a> |
                   <a href="<c:url value='/delete/${student.id}'/>">Delete</a>
                   </td>
                  </tr>
                   
        <% } %>
    </table>

</body>
</html>