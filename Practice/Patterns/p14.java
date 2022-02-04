/*
     *********
      *     *
       *   *
        * *
         *
*/

public class p14 {
    public static void main(String[] args) {
        int n=15;
        for(int rows=0;rows<n;rows++){
            int spaceValBet = rows == 0? 0 : 2*(n-rows-1) -1;
            int colsVal = rows == 0 ? 2*n-3: 0;

            for(int space = 0;space< rows; space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spacebet=0;spacebet<spaceValBet;spacebet++){
                System.out.print(" ");
            }
            if(rows != n-1){
                System.out.print("*");
            }
            for(int cols =0; cols<colsVal;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
