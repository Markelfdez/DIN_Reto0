/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author 2dam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
	private ResourceBundle configFile;
	private String url;
	private String user;
	private String pass;
	//CONSTRUCTOR
	public DBConnection() {
		configFile = ResourceBundle.getBundle("controller.config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}
	public Connection openConnection() throws SQLException {
		Connection con= null;
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
		//System.out.println("Error al intentar abrir la BD");
		//Gestión de la excepción
		}
			return con;
		}
		public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException{
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
		}
	}
}
