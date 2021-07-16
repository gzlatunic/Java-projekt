/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JTextField;
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
public class DrugaFormaTest {
    
    public DrugaFormaTest() {
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
     * Test of main method, of class DrugaForma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DrugaForma.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of my_update method, of class DrugaForma.
     */
    @Test
    public void testMy_update() {
        System.out.println("my_update");
        int dimenzija = 0;
        DrugaForma instance = new DrugaForma();
        instance.my_update(dimenzija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of my_update1 method, of class DrugaForma.
     */
    @Test
    public void testMy_update1() {
        System.out.println("my_update1");
        double[][] matrica = null;
        String matrix_path = "";
        DrugaForma instance = new DrugaForma();
        instance.my_update1(matrica, matrix_path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of riješi_sustav method, of class DrugaForma.
     */
    @Test
    public void testRiješi_sustav() throws Exception {
        System.out.println("rije\u0161i_sustav");
        Sustav obj = null;
        int dim = 0;
        DrugaForma instance = new DrugaForma();
        instance.riješi_sustav(obj, dim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put_i_spremanje method, of class DrugaForma.
     */
    @Test
    public void testPut_i_spremanje() {
        System.out.println("put_i_spremanje");
        double[] objekt = null;
        int dim = 0;
        DrugaForma instance = new DrugaForma();
        instance.put_i_spremanje(objekt, dim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dodaj_u_matricu method, of class DrugaForma.
     */
    @Test
    public void testDodaj_u_matricu() {
        System.out.println("dodaj_u_matricu");
        JTextField t = null;
        DrugaForma instance = new DrugaForma();
        double expResult = 0.0;
        double result = instance.dodaj_u_matricu(t);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of luFaktorizacija method, of class DrugaForma.
     */
    @Test
    public void testLuFaktorizacija() {
        System.out.println("luFaktorizacija");
        Matrica matr = null;
        int dim = 0;
        DrugaForma instance = new DrugaForma();
        DvijeMatrice expResult = null;
        DvijeMatrice result = instance.luFaktorizacija(matr, dim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spremi method, of class DrugaForma.
     */
    @Test
    public void testSpremi() {
        System.out.println("spremi");
        DrugaForma instance = new DrugaForma();
        instance.spremi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imaLiRjesenje method, of class DrugaForma.
     */
    @Test
    public void testImaLiRjesenje() {
        System.out.println("imaLiRjesenje");
        String putanjaMatrice = "";
        String putanjaRjesenja = "";
        DrugaForma instance = new DrugaForma();
        instance.imaLiRjesenje(putanjaMatrice, putanjaRjesenja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispisSvega method, of class DrugaForma.
     */
    @Test
    public void testIspisSvega() {
        System.out.println("ispisSvega");
        DrugaForma instance = new DrugaForma();
        instance.ispisSvega();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
