package myJUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestAdd {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Calling Before Test Method of Addition.....");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Calling After Test Method of Addition.....");
    }

    @Test
    public void testAdd() {
        myCalculator myCal1 = new myCalculator();
      
        assertEquals("Method for Additon...", 13, myCal1.add(10, 3));
        
       
    }
    

}
