package Task4;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int a = scan.nextInt();
        for(int i=0;i<3;i++)
        {
            Test(a,i);
            System.out.println("");
        }
        System.out.println("End of the Program");
    }
    public static void Test(int input,int i)
    {
        try {
            switch (i)
            {
                case 0:
                    if(input/2==0)
                    {
                        throw new OddException();
                    }
                    break;
                case 1:
                    if(input%2!=0)
                    {
                        throw new EvenException();
                    }
                    break;
                case 2:
                    for (int j = 2; j <= input / 2; j++)
                    {
                        if (input % j == 0)
                        {
                            throw new PrimeException();
                        }
                    }
                    break;
            }

        }catch (OddException|EvenException|PrimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
