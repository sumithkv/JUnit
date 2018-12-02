package myJUnitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd.class, TestSub.class, TestMult.class, TestDiv.class, TestParamCal.class })
public class CalculatorTestSuit {

}
