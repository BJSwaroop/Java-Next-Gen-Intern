
public class numberOfZeros {
    public static void main(String[] args) {
        
        int n = 10002000;

        countZeros(n);

    }
    static void countZeros(int n){
        int c = 0;
        System.out.println(helper(n,c));
    }
    static int helper(int n, int c){
        if(n <= 0){
            return c;
        }
        return helper(n/10,n%10 == 0 ? c++ : c);
     }
}
