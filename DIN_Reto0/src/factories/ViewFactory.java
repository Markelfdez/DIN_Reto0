/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import implementations.ViewBDImplementation;
import interfaces.View;
import implementations.ViewImplementation;
import java.util.ResourceBundle;

/**
 * Imprements the view and returns it
 * @author 2dam
 */
public class ViewFactory {
    
    static ResourceBundle config = ResourceBundle.getBundle("config");
    static String option = config.getString("View");
    private static View v;
    
    public static View getView(){
        if (option.equalsIgnoreCase("Text")) {
            v = new ViewImplementation();
        } else {
            v = new ViewBDImplementation();
        }
    return v;
    }
}
