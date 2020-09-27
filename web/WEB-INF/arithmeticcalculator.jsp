<%-- 
    Document   : arithmeticcalculator.jsp
    Created on : Sep 26, 2020, 3:59:06 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="ArithmeticCalculatorServlet">
            First: <input type="text" value="${firstNum}" name="firstNum"><br>
            Second: <input type="text" value="${Second}" name="Second"><br>
            <input type="submit" name="math" value="+"> <input type="submit" name="math" value="-"> 
            <input type="submit" name="math" value="*"> <input type="submit" name="math" value="%"><br>
            Result: ${result}<br>
             <a href="AgeCalculatorServlet"> Age Calculator</a>
        </form>
    </body>
</html>
