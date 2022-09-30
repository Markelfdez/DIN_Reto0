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

public abstract class DBConnection {
	private ResourceBundle config;
	private String url;
	private String user;
	private String pass;
                   private Connection con= null;
                   private PreparedStatement stmt;
	//CONSTRUCTOR
	public DBConnection() {
		config = ResourceBundle.getBundle("config");
		url = config.getString("URL");
		user = config.getString("USER");
		pass = config.getString("PASSWORD");
	}
	public Connection openConnection() throws SQLException {
		try {
                                            con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
		//System.out.println("Error al intentar abrir la BD");
		//Gestión de la excepción
		}
			return con;
		}
		public void closeConnection() throws SQLException{
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
		}
	}
}
