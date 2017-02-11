package sr.unasat.controllers;

import sr.unasat.service.EtenService;
import sr.unasat.service.impl.EtenServiceImpl;
import sr.unasat.service.sr.unasat.webshop.core.ServiceLocator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/list")
public class ListController extends HttpServlet {

    private EtenService etenService = ServiceLocator.getInstance().getEtenService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        request.setAttribute("list", etenService.getFood());
        dispatcher.forward(request, response);
    }
}
