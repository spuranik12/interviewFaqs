package trickyExceptionPrograms;

public class Exception7 {
    /*
    The only case when the code inside finally block is not executed is when System.exit(0)
    is called explicitly in the program. Then exit statement is called and the program
    is terminated without executing any further.
     */
    public static void main(String[] args)
    {
        try
        {
            System.out.printf("1");
            int data = 5 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("2");
            System.exit(0);
        }
        finally
        {
            System.out.printf("3");
        }
        System.out.printf("4");
    }
}
