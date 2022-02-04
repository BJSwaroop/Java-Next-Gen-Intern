/*

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

*/
public class p16 {
    public static void main(String[] args) {
        int n=5;
        for(int rows =0;rows<n;rows++){
            // step 1: print the spaces
            for(int space=n-1;space>rows;space--){
                System.out.print(" ");
            }
            System.out.print("1   ");
            int value= 1;

            for(int cols=0;cols<value;cols++){
                System.out.println( value + "   ");
            }
            // step 2: check for the column values and find out a relation

            

        }
    }
}
