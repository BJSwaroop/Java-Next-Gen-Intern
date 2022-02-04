import java.util.Scanner;

public class factorial{

    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number to find its Factorial: ");
        n = sc.nextInt();
        System.out.println(fact(n));

        sc.close();
    }

    private static int fact(int n) {
        
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        
    }
}
