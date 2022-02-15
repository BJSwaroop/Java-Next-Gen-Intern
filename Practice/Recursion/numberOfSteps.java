public class numberOfSteps {
    
    public static void main(String[] args) {
        int n = 8;
        int c = 0;
        System.out.println(helper(n,c));
    }
    static int helper(int n,int c){
        if(n <=0){
            return c;
        }
        return helper(n%2 == 0 ? n/2:n-1, ++c);
    }
}
