/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import implementations.ModelBDImplementation;
import interfaces.Model;
import implementations.ModelImplementation;
import java.util.ResourceBundle;

/**
 * implements the model and returns it
 *
 * @author 2dam
 */
public class ModelFactory {

    static ResourceBundle config = ResourceBundle.getBundle("config");
    static String option = config.getString("Access");
    private static Model m;

    public static Model getModel() {
        if (option.equalsIgnoreCase("File")) {
            m = new ModelImplementation();
        } else {
            m = new ModelBDImplementation();
        }
        return m;
    }
}
