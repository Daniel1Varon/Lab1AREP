/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.util.LinkedList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Daniel Varón
 */
public class AppIT extends TestCase {
    
    public AppIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of mean method, of class App.
     */
    public void testMean() {
        System.out.println("mean");
        List<Double> lista = new LinkedList();
        lista.add(160.0);
        double expResult = 160.0;
        double result = App.mean(lista);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of standard method, of class App.
     */
    public void testStandard() {
        System.out.println("standard");
        List<Double> lista = null;
        double expResult = 0.0;
        double result = App.standard(lista);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
