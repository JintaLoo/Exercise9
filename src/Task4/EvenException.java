package Task4;

public class EvenException extends java.lang.Exception
{
    public EvenException()
    {
        super("It is not even number");
    }
    public EvenException(String message)
    {
        super(message);
    }
}

