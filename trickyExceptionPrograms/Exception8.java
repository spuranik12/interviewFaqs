package trickyExceptionPrograms;

public class Exception8 {
    /*
    Exceptions can be thrown in catch clause. This is done in order to change
    the exception type at run time. Exceptions in catch clause are thrown by creating instances
    of class Throwable as shown in the program.
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
            Throwable obj = new Throwable("Sample");
            try
            {
                throw obj;
            }
            catch (Throwable e1)
            {
                System.out.printf("8");
            }
        }
        finally
        {
            System.out.printf("3");
        }
        System.out.printf("4");
    }
}
