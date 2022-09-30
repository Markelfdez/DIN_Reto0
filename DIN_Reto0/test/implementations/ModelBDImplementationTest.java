/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelBDImplementationTest {
    ModelBDImplementation modelBD = null;
    
    /**
     * Test of getGreeting method, of class ModelBDImplementation.
     */
    @Test
    public void testGetGreeting() {
        modelBD = new ModelBDImplementation();
        String expResult = "Hello world BD";
        String result = modelBD.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
