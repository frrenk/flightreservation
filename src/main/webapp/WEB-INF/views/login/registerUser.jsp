<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register User</title>
</head>

<body>
<form action="registerUser" method="post">
    <pre>
        <h2>User Registration</h2>
    First Name:       <input type="text" name="firstName"/><br>
    Last Name:        <input type="text" name="lastName"/><br>
    User Name:        <input type="text" name="email"/>  *(E-mail address)<br>
    Password:         <input type="password" name="password"/><br>
    Confirm Password: <input type="password" name="confirmPassword"/><br>
    <input type="submit" value="Register"/>
    </pre>
</form>

</body>
</html>