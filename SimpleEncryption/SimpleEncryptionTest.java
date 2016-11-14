
/**
 * Write a description of class SimpleEncryptionTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleEncryptionTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SimpleEncryptionTest
     */
    public SimpleEncryptionTest()
    {
        // initialise instance variables
        SimpleEncryption seLock = new SimpleEncryption("Hamlet");
        seLock.encrypt();
        System.out.println(seLock.getEncryptedString());
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
