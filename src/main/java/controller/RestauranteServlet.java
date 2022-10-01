package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Restaurante;


@WebServlet("/restaurantes")
public class RestauranteServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            		throws IOException, ServletException{
		
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		restaurantes.add(new Restaurante("Laguiole Lab", "60.00","Rio de Janeiro", "./img/laguiole-lab.jpg"));
		restaurantes.add(new Restaurante("Cipriani", "100.00","Rio de Janeiro", "./img/cipriani.webp"));
		restaurantes.add(new Restaurante("Olympe", "80.00","Rio de Janeiro", "./img/olympe.jpg"));
		restaurantes.add(new Restaurante("Mamma Jamma", "120.00","Rio de Janeiro", "./img/casa-da-mamma-niteroi.jpg"));
		restaurantes.add(new Restaurante("Pobre Juan", "90.00","Rio de Janeiro", "./img/Pobre-juan.webp"));
		restaurantes.add(new Restaurante("Teva", "50.00","Rio de Janeiro", "./img/teva.jpg"));
		
		request.setAttribute("restaurantes", restaurantes);
		RequestDispatcher dispatcher = 
                getServletContext().getRequestDispatcher("/restaurantes.jsp");
		dispatcher.forward(request, response);
	}
}
