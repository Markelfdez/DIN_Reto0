/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelImplementation implements Model{

    @Override
    public String getGreeting() {
        ResourceBundle config = ResourceBundle.getBundle("config.properties");
        
        return config.getString("Message");
    }
    
}
