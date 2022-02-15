import java.util.Scanner;

// https://www.udemy.com/course/cpp-data-structures-algorithms-prateek-narang/learn/quiz/5245736#overview
public class wavePrint {
    public static void main(String[] args) {
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
        int endCol = n-1;
        int row;
        while(endCol >=0){
            if(endCol %2 !=0){
                row = m-1;
                for(int val=row; val>=0;val--){
                    System.out.print(arr[val][endCol]);
                }
            }
            else{
                row = 0;
                for(int val=row; val<m;val++){
                    System.out.print(arr[val][endCol]);
                }
            }
            endCol--;
        }





        sc.close();
    }
}
