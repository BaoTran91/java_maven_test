import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

import static org.junit.Assert.assertEquals;

public class test_TestResult extends TestResult {
    /*
    A TestResult collects the results of executing a test case.
    It is an instance of the Collecting Parameter pattern.
    The test framework distinguishes between failures and errors.
    A failure is anticipated and checked for with assertions.
    Errors are unanticipated problems like an ArrayIndexOutOfBoundsException.
    Some of the important methods of TestResult class are as follows −
    */

    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd() {
        // add any test
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}