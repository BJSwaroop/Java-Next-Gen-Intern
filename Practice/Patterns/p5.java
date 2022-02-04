/* 
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/

public class p5{
    public static void main(String[] args){
        int n=6;

        for(int rows =0;rows<= 2*n;rows++){
            int val =  (rows > n-1) ? (2 * n) - rows   : rows;
            for(int cols = 0; cols < val; cols ++ ){
                System.out.print("*");
        }
        System.out.println();
    }
}
}