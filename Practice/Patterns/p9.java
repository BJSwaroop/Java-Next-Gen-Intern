/* 

    *********
     *******
      *****
       ***
        *

*/

public class p9 {
    
    public static void main(String[] args) {
        int n=5;
        for(int rows=0;rows<n;rows++){
            for(int spaces = 0;spaces<rows;spaces++){
                System.out.print(" ");
            }
            int val = 2*(rows+1) -1;
            for(int cols =2*n ; cols> val;cols--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
