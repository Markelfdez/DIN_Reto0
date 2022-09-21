/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Model;
import implementations.ModelImplementation;

/**
 * implements the model and returns it
 * @author 2dam
 */
public class ModelFactory {

    private static Model m = new ModelImplementation();
    
    public static Model getModel() {
        return m;
    }

}
