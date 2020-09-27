/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 818736
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result ="--";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String operation = request.getParameter("math");
       String firstNum = request.getParameter("firstNum");
       String Second = request.getParameter("Second");
       int num1 =0;
       int num2=0;
       
        int result=0;
        
        request.setAttribute("firstNum", firstNum);
            request.setAttribute("Second", Second);
       
         if( firstNum == null || firstNum.equals("") || Second == null || Second.equals("") || operation == null || operation.equals(""))
        {
            
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
         
         try{
            num1 = Integer.parseInt(firstNum);
            num2 = Integer.parseInt(Second);
        }
        catch(NumberFormatException e){
            
             request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
         switch(operation)
         {
             
             case "+":
                 result = num1 + num2;
                request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            break;
             case "-":
                 result = num1 - num2;
                request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            break;
             case "*":
                 result = num1 * num2;
                request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            break;
             case "%":
                 result = num1 % num2;
                request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            break;
             
         }
        
    }

  

}
