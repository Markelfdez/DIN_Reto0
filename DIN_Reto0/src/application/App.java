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

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModelFactory.getAccessModel();
        ViewFactory.getAccessView();
        
        Controller controller = new Controller();
        
        
    }

}
