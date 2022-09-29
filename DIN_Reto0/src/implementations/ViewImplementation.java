/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.View;

/**
 *
 * @author 2dam
 */
public class ViewImplementation implements View{
    /**
     * show the message "Hello wolrd" from config.properties
     * @param greet 
     */
    @Override
    public void showGreeting(String greet) {
        System.out.println(greet);
    }

}
