package trickyExceptionPrograms;

public class Exception2 {
    /*
        In this example, when no exception is occured from try, it will check for finally block.
        If exists completes finally and will come out of try block without exception.
     */
    public static void main(String[] args) {
        String returnVal = method1();
        System.out.println(returnVal);
    }
    public static String method1() {
        try {
            int i = 9;
            System.out.println(i);
            return "from try";
        } catch (Exception e) {
            System.out.println("exception caught");
            return "from catch";
        } finally {
            System.out.println("finally block executing");
        }
    }
}
