package rahulshettyCoreJavaSec8;

public class pyramidPattern2 {
    public static void main(String[] args) {
        /*
        Print pyramid pattern as
                *
               * *
              * * *
             * * * *
         */
        //int m=1;
        for(int i=0; i<4; i++){
            for(int j=4-i; j>1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
                //m++;
            }
            System.out.println();
        }
    }
}
