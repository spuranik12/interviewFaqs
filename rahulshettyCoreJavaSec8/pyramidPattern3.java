package rahulshettyCoreJavaSec8;
/* PRINT PATTERN AS
        *
     *  *
  *  *  *
 */
public class pyramidPattern3 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int k=2*(5-i); k>=0; k--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
