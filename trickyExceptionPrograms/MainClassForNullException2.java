package trickyExceptionPrograms;

public class MainClassForNullException2 {
    public static void main(String[] args) {
        //1st example
        //Here also it will give NULL bcoz in another variable name is not initialised or null
        NullPointerException2 excep1 = new NullPointerException2();
        excep1.printName();

        //2nd example
        //Here object reference is pointing null
        NullPointerException2 excep2 = null;
        excep2.printName();
    }
}
