/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import controller.DBConnection;
import interfaces.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 2dam
 */
public class ModelBDImplementation extends DBConnection implements Model{

    private Connection con;
    private PreparedStatement stmt;

    final String getGreet = "SELECT * FROM greet";

    @Override
    public String getGreeting() {
      String greet = null; 
      try { 
            ResultSet rs = null;
            
            con = openConnection();
            stmt = con.prepareStatement(getGreet);
            rs = stmt.executeQuery();
            rs.next();
            greet = rs.getString("greet_mssg");
            
        } catch (Exception e) {
        } finally{
          try {
              closeConnection();
          } catch (SQLException ex) {
             
          }
      }
        return greet;
    }
}
