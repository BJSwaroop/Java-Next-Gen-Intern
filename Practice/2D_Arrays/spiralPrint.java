import java.util.Scanner;

// consider a 2d array and print all the elements in spiral order. link:https://www.udemy.com/course/cpp-data-structures-algorithms-prateek-narang/learn/lecture/26672268#overview


public class spiralPrint {
    
    public static void main(String[] args) {
        // take a 2d array input
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Give m value: ");
        m = sc.nextInt();
        System.out.print("Give n value: ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Give elements in array: ");
        for(int rows = 0;rows<m;rows++){
            for(int cols=0;cols<n;cols++){
                arr[rows][cols] = sc.nextInt();
            }
        }
        int time = (m%2 == 0 ) ? m/2 : (m+1)/2;
        // for(int times = 0; times< time;times++){

        // }
            System.out.println(time);
        sc.close();
    }


}
