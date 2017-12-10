package unittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dariusz
 */
public class UnitTestsTest 
{
    private TestClassA classA;
    
    public UnitTestsTest()
    {
        classA = new TestClassA();
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
    
    @Before
    public void setUp()
    {
        classA = new TestClassA();
    }
    
    @After
    public void tearDown()
    {
        classA = null;
    }

    /**
     * Test of main method, of class UnitTests.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        UnitTests.main(args);
        assertEquals(5, classA.Add(2, 3));
        assertFalse(classA.IsNumberPositive(-5));
        assertTrue(classA.IsNumberPositive(7));
        assertNotEquals(10, classA.Add(3, 6));
        assertNull(classA.GuessNumber(14));
        assertNotNull(classA.GuessNumber(15));
    }
    
}
