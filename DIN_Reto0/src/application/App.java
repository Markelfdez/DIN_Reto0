/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author 2dam
 */
import controller.Controller;
import factories.ModelFactory;
import factories.ViewFactory;
import interfaces.View;
import interfaces.Model;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * the method get the view and the model and sends to the controller to run the app
         */
        View v = ViewFactory.getView();
        Model m = ModelFactory.getModel();
        
        Controller controller = new Controller(m, v);
        
        
    }

}
