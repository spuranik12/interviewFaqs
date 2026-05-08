package rahulshettyCoreJavaSec8;

public class pyramidPattern1 {
    public static void main(String[] args) {
        /*
        Print pyramid pattern as
        *
        * *
        * * * *
        * * * * *
         */
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}
