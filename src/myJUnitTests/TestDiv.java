package myJUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestDiv {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        
        System.out.println("BEFORE TEST METHOD FOR DIVISION...");
    }

    @After
    public void tearDown() throws Exception {
        
        System.out.println("AFTER TEST METHOD FOR DIVISION...");
    }

    @Test (expected = IllegalArgumentException.class)
    public void test1() {
        myCalculator myCal4 = new myCalculator();
        
        myCal4.div(24, 36);
    }

    @SuppressWarnings("unused")
	@Test
    public void test2() {
        myCalculator myCal4 = new myCalculator();
        
        int c = myCal4.div(12, 36);
    }
    @Test
    public void test3() {
        myCalculator myCal4 = new myCalculator();
        
        int c = myCal4.div(24, 8);
        
        assertEquals("Successful Divide By Operation...", 3, c);
              
        assertTrue("X is grater than Y", myCal4.getX() > myCal4.getY());
        
    }
    
}
