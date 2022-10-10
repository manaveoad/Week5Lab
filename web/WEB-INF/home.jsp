<%-- 
    Document   : Home
    Created on : 9-Oct-2022, 8:15:23 PM
    Author     : manav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <form method="get" action="login">
        <h1>Home Page</h1>
        
        <h2>Hello ${username}!</h2>
        
        <a href="login">logout </a>
        </form>
    </body>
</html>
