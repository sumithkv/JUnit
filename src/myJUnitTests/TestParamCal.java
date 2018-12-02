package myJUnitTests;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class TestParamCal {
    int a;
    int b;
    int c;

    public TestParamCal(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println(".....BEFORE CLASS.....");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println(".....AFTER CLASS.....");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("...BEFORE METHOD...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("...AFTER METHOD...");
    }
    
    @Parameters
    public static Collection<Integer[]> sampleNumbers() {
        
        Integer[][] myNum = new Integer[][] { { 4, 5, 9 }, { 5, 2, 7 }, { 7, 3, 4 }, { 1, 4, 5 },{ 9, 14, 25 } };
        
                return Arrays.asList(myNum);
                }

    @Test
    public void testCal() {
        
        System.out.println("Adding the numbers " + a + " and " + b +". Result is... " + c);
        myCalculator myCal1 = new myCalculator();
        
        assertEquals("Checking the Addition method using Parameters...", c, myCal1.add(a, b));
    }

}
