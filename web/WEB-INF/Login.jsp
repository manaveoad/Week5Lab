<%-- 
    Document   : Login
    Created on : 9-Oct-2022, 8:15:10 PM
    Author     : manav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form method="post" action="login">
        <h1>Login</h1> 
        
        Username: <input type="text" name="psername" value="${username}"><br>
        Password: <input type="text" name="password" value="${password}"><br>
        <button type="submit">Login</button>
        </form>
    </body>
</html>
