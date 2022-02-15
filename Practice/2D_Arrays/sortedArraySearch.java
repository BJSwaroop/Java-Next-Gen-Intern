import java.util.Scanner;

// there are three aproaches for this quetion 1. Brute force method 2. Binary search 3. Staircase method
public class sortedArraySearch {
    
    // staircase method:
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Give m value: ");
        int m = sc.nextInt();
        System.out.print("Give n value: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Give Elements of Matrix with Sorted rows and Columns : ");
        for(int rows=0;rows<m;rows++){
            for(int cols=0;cols<n;cols++){
                arr[rows][cols] = sc.nextInt();
            }
        }
        System.out.print("Give an element to find in the array: ");
        int elem = sc.nextInt();
        int i = 0,j = n-1;
        while(i<m-1 && j>=0){

            if(arr[i][j] == elem){
                System.out.println("Element found at " + i + ", " + j + " index in the given matrix.");
                break;
            }
            else if(arr[i][j] < elem){
                i++;
            }
            else{
                j--;
            }

        }



        sc.close();
    }
}
