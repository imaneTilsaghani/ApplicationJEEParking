/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Login;
import beans.Section;
import com.google.gson.Gson;
import connexion.Connexion;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.LoginService;

/**
 *
 * @author Imane
 */
@WebServlet(urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private LoginService ss = new LoginService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("op") != null) {
            System.out.println("bien ");
            if (request.getParameter("op").equals("log")) {
               // Login l=new Login();
                String username = request.getParameter("username");
                String password = request.getParameter("password");
               // l=ss.findAlls(username, password);
                LoginService lgs = new LoginService();
                List<Login> login = lgs.findAll();
                int cpt =0;
                Login user= new Login();
                for(Login log : lgs.findAll())  {
                    if(log.getusername().equals(username) && log.getpassword().equals(password))
                    {
                        user.setId(log.getId());
                        user.setusername(log.getusername());
                        user.setPassword(log.getpassword());
                        cpt++;
                    }
                }
               System.out.println("user :"+user);
                if(cpt>0)
                {
                    
                     response.sendRedirect("/Gestion_Parking/index.jsp?id="+user.getId()+"&username="+user.getusername());
                }
             
            } 
        
        }
    }

        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo

        
            () {
        return "Short description";
        }
    }
