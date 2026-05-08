package trickyExceptionPrograms;
import java.io.EOFException;
import java.io.IOException;

public class Exception9 {
    /*
    In multi-catch statements, the exceptions must be listed from more specific to more general.
    Only one catch statement which is most specific to the occurred exception is executed.'
    If matching exception is caught in catch then will print with exception occured, else will
    call default exception class
     */
    public static void main(String[] args)
    {
        try
        {
            System.out.printf("1");
            int value = 10 / 5;
            throw new IOException();
        }
        catch(EOFException e)
        {
            System.out.printf("2");
        }
        catch(ArithmeticException e)
        {
            System.out.printf("3");
        }
        catch(NullPointerException e)
        {
            System.out.printf("4");
        }
//        catch(IOException e)
//        {
//            System.out.printf("5");
//        }
        catch(Exception e)
        {
            System.out.printf("6");
        }
    }
}
