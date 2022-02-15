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
        int m1 = (m%2 == 0 ) ? m/2 : (m+1)/2;
        int n1 = (n%2 == 0 ) ? n/2 : (n+1)/2;
        int time = m1 < n1 ? m1 : n1;
        int startCol=0,startRow=0,endCol=n-1,endRow=m-1;
        for(int times = 0; times< time;times++){
            
            if(startCol == endCol && startRow == endRow){
                System.out.print(arr[startCol][endRow]);
                break;    
            }

            if(startCol > endCol || startRow>endRow){
                break;
            }
            
            for(int top = startCol;top<=endCol; top++){
                System.out.print(arr[startRow][top]);
            }
            for(int right = startRow+1;right<=endRow-1; right++){
                if(n>1){
                    System.out.print(arr[right][endCol]);
                }
            }
            for(int bottom = endCol;bottom>=startCol; bottom--){
                if(m>1){
                    System.out.print(arr[endRow][bottom]);
                }
            }
            for(int left = endRow-1;left>=startRow+1; left--){
                System.out.print(arr[left][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        sc.close();
    }


}
