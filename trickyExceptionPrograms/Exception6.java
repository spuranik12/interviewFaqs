package trickyExceptionPrograms;

public class Exception6 {
    /*
    If an exception is handled in the catch statement, the program continues with its normal
    execution, after executing the catch statement corresponding to that exception.
    Also, when an exception occurs in the try block, the rest of the program in the try block
    is not executed.
     */
    private void m1()
    {
        m2();
        System.out.printf("1");
    }
    private void m2()
    {
        m3();
        System.out.printf("2");
    }
    private void m3()
    {
        System.out.printf("3");
        try
        {
            int sum = 4/0;
            System.out.printf("4");
        }
        catch(ArithmeticException e)
        {
            System.out.printf("5");
        }


        System.out.printf("7");
    }
    public static void main(String[] args)
    {
        Exception6 obj = new Exception6();
        obj.m1();
    }
}
