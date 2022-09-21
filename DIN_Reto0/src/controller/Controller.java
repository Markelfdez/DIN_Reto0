/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import interfaces.Model;
import interfaces.View;

/**
 *
 * @author 2dam
 */
public class Controller {

    /**
     * take the model and view form tha app class
     * @param m
     * @param v 
     */
    public Controller(Model m, View v) {
        run(m, v);
    }
    
    /**
     * run the app taking the message and showing it
     * @param m
     * @param v 
     */
    public void run(Model m, View v){
       String greet;
       greet = m.getGreeting();
       v.showGreeting(greet);
    }
    
}


    