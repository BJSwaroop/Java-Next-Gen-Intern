public class reverseOfNumber {
    
    public static void main(String[] args) {
        int n = 1234;

        System.out.println( rev(n));
    }
    static int rev(int n){

       return helper(n, (n+"").length());
    }
    private static int helper(int n,int digits) {
        // base conditioon
        if(n %10 == n){
            return n;
        }
        return (int) ((n%10) * Math.pow(10, digits-1) + helper(n/10, digits-1));
    }
}
