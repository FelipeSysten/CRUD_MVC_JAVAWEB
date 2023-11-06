package com.exploretour.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exploretour.dao.UsuariosDAO;
import com.exploretour.model.Usuarios;

@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Usuarios usuarios = new Usuarios();
		
		usuarios.setNome(req.getParameter("nome"));
		usuarios.setLogin(req.getParameter("login"));
		usuarios.setSenha(req.getParameter("senha"));
		usuarios.setDataNasc(LocalDate.parse(req.getParameter("dataNasc")));
		
		try {
			UsuariosDAO usuariosDAO = new UsuariosDAO();
			usuariosDAO.createUsuario(usuarios);
			
			
			res.sendRedirect("ReadController");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
