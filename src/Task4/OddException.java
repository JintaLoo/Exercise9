package Task4;

public class OddException extends java.lang.Exception
{
    public OddException()
    {
        super("It is not odd number");
    }
    public OddException(String message)
    {
        super(message);
    }
}

