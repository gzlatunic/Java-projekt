/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author gabrijela
 */
public class SustavTest {
    
    public SustavTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setRjesenje method, of class Sustav.
     */
    @Test
    public void testSetRjesenje() {
        System.out.println("setRjesenje");
        double[] t = null;
        Sustav instance = new Sustav();
        instance.setRjesenje(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRjesenje method, of class Sustav.
     */
    @Test
    public void testGetRjesenje() {
        System.out.println("getRjesenje");
        Sustav instance = new Sustav();
        double[] expResult = null;
        double[] result = instance.getRjesenje();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of riješiJednadžbu method, of class Sustav.
     */
    @Test
    public void testRiješiJednadžbu() {
        System.out.println("rije\u0161iJednad\u017ebu");
        Matrica A = null;
        double[] b = null;
        Sustav instance = new Sustav();
        double[] expResult = null;
        double[] result = instance.riješiJednadžbu(A, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
