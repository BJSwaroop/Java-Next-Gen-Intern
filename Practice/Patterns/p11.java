/*
     * * * * *
      * * * *
       * * *
        * *
         *
*/
public class p11 {
    public static void main(String[] args) {
        int n=5;
        for(int rows=0; rows<n;rows++){
            for(int spaces=0;spaces<rows; spaces++){
                System.out.print(" ");
            }
            for(int cols=n;cols>rows;cols--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
