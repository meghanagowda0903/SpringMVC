<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Fill in the Form</h1>
    <form action="student" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required/><br><br>
        
        <label for="age">Email:</label>
        <input type="text" name="email" id="email" required/><br><br>
        
        <label for="phno">Course:</label>
        <input type="text" name="course" id="course" required/><br><br>
        
        <input type="submit" value="Submit">
    </form>

</body>
</html>