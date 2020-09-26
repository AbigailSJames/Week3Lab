/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 818736
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int ageOfUser=0;
        
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        
        if(age == null || age.equals(""))
        {
             String display = "You must give your current age <br>";
            request.setAttribute("display", display);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        try{
            ageOfUser = Integer.parseInt(age);
        }
        catch(NumberFormatException e){
            String display = "You must enter a number.<br>";
            request.setAttribute("display", display);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        ageOfUser = ageOfUser +1;
         String display = String.format("Your next age is %d . <br>", ageOfUser);
            request.setAttribute("display", display);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
        
    }

  

}
