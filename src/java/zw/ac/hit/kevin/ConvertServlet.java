/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package zw.ac.hit.kevin;

import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException; 
import java.io.PrintWriter;




/**
 *
 * @author KevinGwindingwi
 */
@WebServlet(name = "ConvertServlet", urlPatterns = {"/ConvertServlet"})
public class ConvertServlet extends HttpServlet {
        
    @EJB
    ConvertBean obj;
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
         
         Double usd = Double.valueOf(req.getParameter("usd"));
         String currency   = req.getParameter("currency");
         obj.setCurrency(currency);
         obj.setUsd(usd);
         obj.exchangeRate();
        String c = obj.getCurrency();
         
         Double value = obj.getValue();
         PrintWriter out = res.getWriter();
         out.println("the usd value :" + usd + " coverted to " + currency + "is " + value  );
   }
}