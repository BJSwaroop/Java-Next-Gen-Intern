/*
         *
        * *
       *   *
      *     *
     *********
*/
public class p13 {
    
    public static void main(String[] args) {
        
        int n=15;
        for(int rows=0;rows<n;rows++){
            int spaceValBet = rows == n-1 ? 0: 2*rows-1;
            int colsVal = rows == n-1 ? 2*rows -1 : 0;

            for(int space=n;space> rows;space--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int betSpace = 0;betSpace<spaceValBet;betSpace++){
                System.out.print(" ");
            }
            if(rows>=1){

                System.out.print("*");
            }
            for(int cols = 0; cols<colsVal;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
