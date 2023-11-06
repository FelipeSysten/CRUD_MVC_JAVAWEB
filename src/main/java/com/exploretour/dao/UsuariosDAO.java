package com.exploretour.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exploretour.database.DatabaseConnection;
import com.exploretour.model.Usuarios;

public class UsuariosDAO {

	private Connection connection;
	private String sql;

	public UsuariosDAO() throws SQLException {
		connection = DatabaseConnection.createConnection();
	}


	public void createUsuario(Usuarios usuarios) {
		sql = "INSERT INTO usuarios (nome, login, senha, dataNasc) VALUES (?,?,?,?)";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setString(1, usuarios.getNome());
			stmt.setString(2, usuarios.getLogin());
			stmt.setString(3, usuarios.getSenha());

			Date data = Date.valueOf(usuarios.getDataNasc());

			stmt.setDate(4, data);

			stmt.executeUpdate();

			System.out.println("Cliente criado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuarios findUsuario(int id) {
		Usuarios usuarios = null;
		sql = "SELECT * FROM usuarios WHERE id=?";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setInt(1, id);
			ResultSet r = stmt.executeQuery();

			if (r.next()) {
				usuarios = new Usuarios();
				usuarios.setId(r.getInt("id"));
				usuarios.setNome(r.getString("nome"));
				usuarios.setLogin(r.getString("login"));
				usuarios.setSenha(r.getString("senha"));
				usuarios.setDataNasc(r.getDate("dataNasc").toLocalDate());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}
	
	
	
	public List<Usuarios> findUsuarios() {

		String sql = "SELECT * FROM usuarios";

		List<Usuarios> usuario = new ArrayList<Usuarios>();

		ResultSet r = null;

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			r = stmt.executeQuery();

			while (r.next()) {
				Usuarios usuarios = new Usuarios();
				usuarios = new Usuarios();
				usuarios.setId(r.getInt("id"));
				usuarios.setNome(r.getString("nome"));
				usuarios.setLogin(r.getString("login"));
				usuarios.setSenha(r.getString("senha"));
				usuarios.setDataNasc(r.getDate("dataNasc").toLocalDate());

				usuario.add(usuarios);
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return usuario;

	}
	
	
	

	public void updateUsuario(Usuarios usuarios) {
		sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ?, dataNasc = ? WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, usuarios.getNome());
			stmt.setString(2, usuarios.getLogin());
			stmt.setString(3, usuarios.getSenha());

			Date sqlDate = Date.valueOf(usuarios.getDataNasc());

			stmt.setDate(4, sqlDate);
			stmt.setInt(5, usuarios.getId());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteUsuario(int id) {
		sql = "DELETE FROM usuarios WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();

			System.out.println("Cliente Deletado com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
