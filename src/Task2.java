public class Task2
{
    public static void Test(int input)
    {
        System.out.println("Input value = "+input);
        try
        {
            switch (input)
            {
                case 0:
                    int a=10/input;
                    break;
                case 1:
                    int array[] =new int[10];
                    array[11]=input;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException e) {
            System.out.print(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(e);
        }
        finally {
            System.out.println("End");
        }
    }
        public static void main(String[] args)
        {
            for(int i=0;i<3;i++)
            {
                Test(i);
                System.out.println("");
            }
        }
    }

