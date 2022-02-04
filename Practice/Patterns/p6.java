/* 
         *
        **
       ***
      ****
     *****
*/
public class p6 {
    
     public static void main(String[] args) {
          
     int n=5;
     for(int rows=0; rows<n;rows++){
          for(int spaces=n;spaces>rows; spaces--){
               System.out.print(" ");
          }
          for(int cols=0;cols<=rows;cols++){
               System.out.print("*");
          }
          System.out.println();
     }
  
}
}
