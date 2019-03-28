<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Find Flights</title>
</head>

<body>
<pre>
<h2>Find Flights:</h2>
<form action="findFlights" method="post">
    From: <input type="text" name="from"/><br>
    To:   <input type="text" name="to"/><br>
    <input type="submit" value="Search"/>
</form>
</pre>
</body>
</html>