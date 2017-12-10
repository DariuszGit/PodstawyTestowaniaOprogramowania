
package unittests;

public class TestClassA
{

    
    public TestClassA()
    {
        
    }    
    
    public int Add(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }
    
    public boolean IsNumberPositive(int number)
    {
        if (number > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public TestClassA GuessNumber(int attemptNumber)
    {
        int z = 15;
        if (attemptNumber == z)
        {
            return this;
        }
        return null;
    }
}
