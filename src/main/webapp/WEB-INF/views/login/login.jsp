<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Login</title>
</head>

<body>
<pre>
<h2>Login:</h2>
<form action="login" method="post">
        ${msg}
    User Name: <input type="text" name = "email"/><br>
    Password:  <input type="password" name = "password"/><br>
    <input type="submit" value="Login"/>
    </pre>
</form>

</body>
</html>