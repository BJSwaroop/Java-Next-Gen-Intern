/* 
    *****
    ****
    ***
    **
    *
*/
public class p3 {
    public static void main(String[] args){
        int rows,n=5,cols;
        for(rows =0;rows<n;rows++){
            // step 2
            for(cols=n;cols>rows;cols--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}