package myJUnitTests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSub {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BEFORE CLASS FOR SUBSTRACTION");
        
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AFTER CLASS FOR SUBSTRACTION");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Calling Before Test Method of Substration...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Calling After Test Method of Substraction...");
    }

    @Test
    public void test1() {
      
        myCalculator myCal2 = new myCalculator();
     
        assertEquals("Method for Substraction...1", 7, myCal2.sub(10, 3));
       
    }
    @Test
    public void test2() {
        
        myCalculator myCal2 = new myCalculator();
     
        assertEquals("Method for Substraction...2", 6, myCal2.sub(10, 3));
       
    }
    @Test
    public void test3() {
        
        myCalculator myCal2 = new myCalculator();
     
        assertEquals("Method for Substraction...3", 8, myCal2.sub(11, 3));
       
    }
}
