/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Sinaga
 */
public class myKalkulatorTest {
    myKalkulator kalkulator;

    
    @Before
    public void init() {
        kalkulator = new myKalkulator();
    }

    /**
     * Test of kali method, of class myKalkulator.
     */
    @Test
    public void testKali() {
        assertEquals(20, kalkulator.kali(10, 2), 0);
    }

    /**
     * Test of bagi method, of class myKalkulator.
     */
    @Test
    public void testBagi() {
       assertEquals(5, kalkulator.bagi(10, 2), 0);
    }

    /**
     * Test of tambah method, of class myKalkulator.
     */
    @Test
    public void testTambah() {
        assertEquals(12, kalkulator.tambah(10, 2), 0);
    }

    /**
     * Test of kurang method, of class myKalkulator.
     */
    @Test
    public void testKurang() {
        assertEquals(8, kalkulator.kurang(10, 2), 0);
    }


}