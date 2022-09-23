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

/**
 *
 * @author 2dam
 */
public class ModelBDImplementation implements Model{

    DBConnection db = new DBConnection();
    private Connection con;
    private PreparedStatement stmt;

    final String getGreet = "SELECT * FROM din_reto0.greet";

    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String greet = null;
        try {
            db.openConnection();
            stmt = con.prepareStatement(getGreet);
            rs = stmt.executeQuery();
            if(rs.next()){
                greet = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return greet;
    }
}
