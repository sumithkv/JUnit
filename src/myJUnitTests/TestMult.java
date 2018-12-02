package myJUnitTests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestMult {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Calling Before Test Method of Multiplication...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Calling After Test Method of Multiplicaton...");
    }

    @Test
    public void testMult1() {
        
        myCalculator myCal3 = new myCalculator();
        
        assertEquals("Method for Multiplication...1", 125, myCal3.mult(5, 25));
    }
    
    @Test
    public void testMult2() {
        
        myCalculator myCal3 = new myCalculator();
        
        assertEquals("Method for Multiplication...2", 18, myCal3.mult(3, 6));
    }

}
