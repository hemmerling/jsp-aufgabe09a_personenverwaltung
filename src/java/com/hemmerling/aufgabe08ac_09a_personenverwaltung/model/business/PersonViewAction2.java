/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe08ac_09a_personenverwaltung.model.business;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
public class PersonViewAction2 implements Action {

    private static final String VIEWPAGE2 = "view2.jsp";

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(VIEWPAGE2);
        requestDispatcher.forward(request, response);
    }
}
