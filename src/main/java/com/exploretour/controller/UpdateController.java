package com.exploretour.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exploretour.dao.UsuariosDAO;
import com.exploretour.model.Usuarios;



@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		
		try {
			UsuariosDAO uDAO = new UsuariosDAO();
			Usuarios usuarios = uDAO.findUsuario(id);
			
			req.setAttribute("usuarios", usuarios);
			
			RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
			rd.forward(req, res);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			Usuarios usuarios = new Usuarios();
			usuarios.setId(Integer.parseInt(req.getParameter("id")));
			usuarios.setNome(req.getParameter("nome"));
			usuarios.setLogin(req.getParameter("login"));
			usuarios.setSenha(req.getParameter("senha"));
			usuarios.setDataNasc(LocalDate.parse(req.getParameter("dataNasc")));
			
			
			UsuariosDAO uDAO = new UsuariosDAO();
			uDAO.updateUsuario(usuarios);
			
			res.sendRedirect("ReadController");
		} catch (Exception e) {
			
		}
		
		
		
		
	}

}
