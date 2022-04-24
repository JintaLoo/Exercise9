package Task4;

public class PrimeException extends Exception
{
    public PrimeException()
    {
        super("It is not prime number");
    }
    public PrimeException(String message)
    {
        super(message);
    }
}
