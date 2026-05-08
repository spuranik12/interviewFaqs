package trickyExceptionPrograms;

public class Exception4 {
    /*
    GROUND RULE:-
    1) If exception does not occur then try continues the execution til the last line before the return statement in try block and then

control goes to finally block, if finally does not have any return then control comes back to try’s return statement and hence completes.

If finally has return statement then flow returns from finally it never reaches back to try’s return statement.

    2) If exception occurs in try block then control jumps to catch block and if catch has return statement then flow excecutes until last line

before return in catch , then control goes to finally, if finally has return then control returns to caller and if finally does not have return

then control goes back to return statement of catch block.

     */
    public static void main(String[] args) {
        String returnVal = method1();
        System.out.println(returnVal);
    }
    public static String method1() {
        try {
            int i = 9/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("exception caught");
            return "from catch";
        } finally {
            System.out.println("finally block executing");
        }
        System.out.println("end");
        return "from end";
    }
}
