package com.exploretour.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exploretour.dao.UsuariosDAO;
import com.exploretour.model.Usuarios;
 

@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try {
			UsuariosDAO uDAO = new UsuariosDAO();
			List<Usuarios> usuario = uDAO.findUsuarios();
			req.setAttribute("usuario", usuario);
			
			RequestDispatcher rd = req.getRequestDispatcher("usuarios.jsp");
			rd.forward(req, res);

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}