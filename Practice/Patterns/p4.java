/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

public class p4 {
    
    public static void main(String[] args){

        int n=5;
        for(int rows =0;rows<n;rows++){
            for(int cols=0;cols <= rows;cols++ ){
                System.out.print(cols+1 + " ");
            }
            System.out.println();
        }
    }
}
