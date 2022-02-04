/* 
    *****
    *****
    *****
    *****
    *****

*/
public class p1 {
   
    public static void main(String[] args){

        // step 1 : know the number of rows.
        int rows,cols,n=5;
        for(rows =0;rows<5;rows++){
            // step 2 : know the number of columns and the value that has to be printed there.
            String value = "*";
            for(cols=0; cols<n;cols++){
                System.out.print(value);
            }
            System.out.println();
        }

    }
}
