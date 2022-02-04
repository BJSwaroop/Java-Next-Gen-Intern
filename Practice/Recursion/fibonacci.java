import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("0\n1");
        fib(n,0,1);
        sc.close();
    }

    private static void fib(int n,int a,int b) {

        if(n==2){
            
        }
        else{
            System.out.println(a+b);
            fib(n-1,b,a+b);
        }
    }
}