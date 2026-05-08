package trickyExceptionPrograms;

public class NullPointerException1 {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(s.toLowerCase());
        try {
            System.out.println(s.length());//here object reference is null so nullpointer
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
