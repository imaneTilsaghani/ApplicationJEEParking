/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Section;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.SectionService;

/**
 *
 * @author Imane
 */
@WebServlet(urlPatterns = {"/SectionController"})
public class SectionController  extends HttpServlet {

     private SectionService ss = new SectionService();
     
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));

            } else if (request.getParameter("op").equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ss.delete(ss.findById(id));
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));
            }
            else if (request.getParameter("op").equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String ref = request.getParameter("ref");
                ss.update(new Section(id,ref));
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));
             
            }

        } else {
            String ref = request.getParameter("ref");
            ss.create(new Section(ref));
            response.setContentType("application/json");
            List<Section> Sections = ss.findAll();
            Gson json = new Gson();

            response.getWriter().write(json.toJson(Sections));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
