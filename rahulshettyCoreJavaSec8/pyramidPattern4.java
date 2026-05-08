package rahulshettyCoreJavaSec8;

public class pyramidPattern4 {
    public static void main(String[] args) {
        int m=1;
        for(int i=0; i<5; i++){
            for(int j=5-i; j>0; j--){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
