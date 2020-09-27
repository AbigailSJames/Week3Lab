<%-- 
    Document   : agecalculator
    Created on : Sep 26, 2020, 2:29:53 PM
    Author     : 818736
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculatorServlet">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">     
        </form>
           ${display}
            <a href="ArithmeticCalculatorServlet"> Arithmetic Calculator</a>
    </body>
</html>
