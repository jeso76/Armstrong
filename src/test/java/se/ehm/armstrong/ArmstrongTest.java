package se.ehm.armstrong;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ArmstrongTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ArmstrongTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ArmstrongTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testArmstrong()
    {
        assertTrue( true );
    }
}
