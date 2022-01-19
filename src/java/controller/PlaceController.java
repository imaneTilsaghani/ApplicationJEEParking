/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Place;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.PlaceService;

/**
 *
 * @author Imane
 */
@WebServlet(urlPatterns = {"/PlaceController"})
public class PlaceController extends HttpServlet {

    private PlaceService ps = new PlaceService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Place> Places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Places));

            } else if (request.getParameter("op").equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.delete(ps.findById(id));
                response.setContentType("application/json");
                List<Place> Places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Places));

            } else if (request.getParameter("op").equals("gene")) {
                int id = Integer.parseInt(request.getParameter("id"));

                List<Place> places = ps.findAllbySection(id);
                if (places.isEmpty()) {
                    ps.gene(id);
                    response.setContentType("application/json");
                    Gson json = new Gson();
                    response.getWriter().write(json.toJson("done"));
                }

            } else if (request.getParameter("op").equals("updateEtat")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.updateEtat(ps.findById(id));
                response.setContentType("application/json");
                List<Place> Places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Places));
            } else if (request.getParameter("op").equals("updateEtatFalse")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.updateEtatFalse(ps.findById(id));
                response.setContentType("application/json");
                List<Place> Places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Places));
            } else if (request.getParameter("op").equals("statitics")) {
                int count = ps.findetat(4);
                response.setContentType("application/json");
                Gson json = new Gson();
                response.getWriter().write(json.toJson(count));
            }

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
