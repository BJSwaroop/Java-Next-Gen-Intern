public class numberExample {
    public static void main(String[] args) {
        //  write a function that takes in a number and prints it 
        // print first 5 numbers: 1 2 3 4 5

        // without reecursion
        print(1);

        // without recursion
        // print1(1);
    }
    static void print(int n){
        // base Condition part
        if(n == 6){
            return;
        }
        // recursive function
        System.out.println(n);
        print(n +1);
    }
    static void print1(int n) {
        print2(2);
        System.out.println(n);
    }
    private static void print2(int n) {
        print3(3);
        System.out.println(n);
    }
    private static void print3(int n) {
        print4(4);
        System.out.println(n);
    }
    private static void print4(int n) {
        print5(5);
        System.out.println(n);
    }
    private static void print5(int n) {
        System.out.println(n);
    }
}
