/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/
public class p12 {
    public static void main(String[] args) {
        
        int n=5;
        for(int rows=0;rows<2*n;rows++){
           int spaceVal= rows >= n ? 2* n - rows -1 : rows; 
           int colsVal = rows >= n ? rows-n+1: n-rows ;

           for(int spaces = 0;spaces<spaceVal;spaces++){
               System.out.print(" ");
           }
           for(int cols = 0;cols<colsVal;cols++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }

}
