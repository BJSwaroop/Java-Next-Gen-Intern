import java.util.Scanner;

public class sumOfnNos {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Give n: ");
       int n = sc.nextInt();
       System.out.println(sum(n));
       sc.close();
   }

private static int sum(int n) {
    if(n == 0){
        return 0;
    }
    return n + sum(n-1);
} 
}
