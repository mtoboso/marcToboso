/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bosc de la Coma
 */
public class PilaTest {

    public PilaTest() {
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
     * Quan el valor és inferior a 0 ha de retornar 0. 
     */
    @Test
    public void testAfegir1() {
        System.out.println("afegir");
        int el = -4;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Quan el valor és 0 ha de retornar 0.
     */
    @Test
    public void testAfegir2() {
        System.out.println("afegir");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Quan el valor està dintre els limits (0 - 100) Ha de retornar el valor
     * entrat.
     */
    @Test
    public void testAfegir3() {
        System.out.println("afegir");
        int el = 4;
        Pila instance = new Pila();
        int expResult = 4;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Valor limit 100. Ha de retornar 100.
     */
    @Test
    public void testAfegir4() {
        System.out.println("afegir");
        int el = 100;
        Pila instance = new Pila();
        int expResult = 100;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Valor superior al màxim (lastEL). Ha de retornar el valor. En aquest cas
     * 105
     */
    @Test
    public void testAfegir5() {
        System.out.println("afegir");
        int el = 105;
        Pila instance = new Pila();
        int expResult = 105;
        instance.afegir(el);
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * No hi ha elements a la pila, per tant retorna -1
     */
    @Test
    public void testTreure1() {
        System.out.println("treure");
        Pila instance = new Pila();
        int expResult = -1;
        instance.afegir(0);
        int result = instance.treure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Al afegir 80 elements a la pila el lastEl val 81 per tant retorna 80.
     */
    @Test
    public void testTreure2() {
        System.out.println("treure");
        Pila instance = new Pila();
        int expResult = 80;
        instance.afegir(80);
        int result = instance.treure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
