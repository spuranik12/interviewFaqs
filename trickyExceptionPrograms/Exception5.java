package trickyExceptionPrograms;

public class Exception5 {
    /*
    Once an exception occurs in try block, the execution passes to corresponding catch
    statement and doesn't return back to try block. Only one of the catch blocks are
    executed at a time. finally block is always executed whether or not the exception occurred.
     */
    public static void main(String[] args) {
        try
        {
            System.out.printf("1");
            int sum = 9 / 0;
            System.out.printf("2");
        }
        catch(ArithmeticException e)
        {
            System.out.printf("3");
        }
        catch(Exception e)
        {
            System.out.printf("4");
        }
        finally
        {
            System.out.printf("5");
        }
    }
}
