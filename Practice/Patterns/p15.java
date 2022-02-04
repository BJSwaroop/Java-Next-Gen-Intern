/*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */

public class p15 {
    public static void main(String[] args) {
        int n=5;
        for(int rows=0; rows<2*n-1;rows++){
            System.out.print(1);
            int spaceValBet = rows>= n? 2* (2*n - rows -2) - 1: 2 * rows -1;
            int spaceVal = rows< n? 2*(n) - rows +1: rows +3;
            for(int spaces = 0; spaces< spaceVal;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spacebet = 0; spacebet< spaceValBet;spacebet++){
                System.out.print(" ");
            }
            if(rows> 0  && rows < 2*n-2 ){

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
