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
import static org.junit.Assert.*;

/**
 *
 * @author gabrijela
 */
public class MatricaTest {
    
    public MatricaTest() {
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
     * Test of setDim method, of class Matrica.
     */
    @Test
    public void testSetDim() {
        System.out.println("setDim");
        int dim = 0;
        Matrica instance = null;
        instance.setDim(dim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDim method, of class Matrica.
     */
    @Test
    public void testGetDim() {
        System.out.println("getDim");
        Matrica instance = null;
        int expResult = 0;
        int result = instance.getDim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMat method, of class Matrica.
     */
    @Test
    public void testSetMat() {
        System.out.println("setMat");
        double[][] mat = null;
        Matrica instance = null;
        instance.setMat(mat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMat method, of class Matrica.
     */
    @Test
    public void testGetMat() {
        System.out.println("getMat");
        Matrica instance = null;
        double[][] expResult = null;
        double[][] result = instance.getMat();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redak method, of class Matrica.
     */
    @Test
    public void testRedak() {
        System.out.println("redak");
        int red = 0;
        Matrica instance = null;
        double[] expResult = null;
        double[] result = instance.redak(red);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stupac method, of class Matrica.
     */
    @Test
    public void testStupac() {
        System.out.println("stupac");
        int stup = 0;
        Matrica instance = null;
        double[] expResult = null;
        double[] result = instance.stupac(stup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of izbaciSR method, of class Matrica.
     */
    @Test
    public void testIzbaciSR() {
        System.out.println("izbaciSR");
        int s = 0;
        int r = 0;
        Matrica instance = null;
        Matrica expResult = null;
        Matrica result = instance.izbaciSR(s, r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinanta method, of class Matrica.
     */
    @Test
    public void testDeterminanta() {
        System.out.println("determinanta");
        Matrica instance = null;
        double expResult = 0.0;
        double result = instance.determinanta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minore method, of class Matrica.
     */
    @Test
    public void testMinore() {
        System.out.println("minore");
        Matrica instance = null;
        Matrica expResult = null;
        Matrica result = instance.minore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverz method, of class Matrica.
     */
    @Test
    public void testInverz() {
        System.out.println("inverz");
        Matrica instance = null;
        Matrica expResult = null;
        Matrica result = instance.inverz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of množiMatricom method, of class Matrica.
     */
    @Test
    public void testMnožiMatricom() {
        System.out.println("mno\u017eiMatricom");
        double[] b = null;
        Matrica instance = null;
        double[] expResult = null;
        double[] result = instance.množiMatricom(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
