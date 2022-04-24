public class Task1
{
    public static void Test()
    { String a = null;
        if (a.equals("b"))
            System.out.print("Same");
        else
            System.out.print("Not Same");
    }

    public static void main(String[] args)
    {
        try {
            Test();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.print(e);
        }
    }
}
