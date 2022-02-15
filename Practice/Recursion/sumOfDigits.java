public class sumOfDigits {
    public static void main(String[] args) {
        int n = 12345;

        System.out.println((sum(n)));
    }

    private static int sum(int n) {

        // base conditions
        if(n<=0){
            return 0;
        }

        return n%10 + sum(n/10);
    }
    
}
