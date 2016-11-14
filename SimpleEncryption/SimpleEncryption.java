
/**
 * Write a description of class SimpleEncryption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleEncryption
{
    // instance variables - replace the example below with your own
    private String rawString="";
    private String newString="";

    /**
     * Constructor for objects of class SimpleEncryption
     */
    public SimpleEncryption(String inputString)
    {
        // initialise instance variables
        rawString = inputString;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void encrypt()
    {
        int counter = 0; //start with char 0
        while (counter < rawString.length())
        {
            newString += (char)((int)rawString.charAt(counter)+3);
            counter++;
        }
        
    }
    
    public String getEncryptedString()
    {
        return newString;
    }
}
