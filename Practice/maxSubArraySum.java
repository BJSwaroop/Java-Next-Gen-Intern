package Practice;

import java.util.Scanner;
// interface Arr{
//     int[] Arr
// }

class maxSum1{
    // O(N^2)
    int[] arr;
    public maxSum1(int[] arr){
        this.arr = arr;
    }
    public void display(){
        int maxi = -1000;
        int currsum;
        for(int i=0;i<arr.length;i++){
            currsum =0;
            for(int j =i;j<arr.length;j++){
                currsum = currsum +arr[j];
                if(currsum > maxi){
                    maxi = currsum;
                }
            }
            
        }
        System.out.println(maxi);
    }
}
class maxSum2{
    // O(N)
    int[] arr;
    public maxSum2(int[] arr){
        this.arr = arr;
    }
    public void display(){
        int maxi=-1000;
        int currsum = 0;
        for(int i=0;i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum > maxi){
                maxi = currsum;
            }
            if(currsum < 0){
                currsum =0;
            }
        }
        System.out.println(maxi);
    }
}
public class maxSubArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        
        System.out.println("Enter elements in Array: ");
        for( int i = 0;i<n;i++){
            myArr[i] = sc.nextInt();
        }    
        maxSum1 m1 = new maxSum1(myArr);
        maxSum2 m2 = new maxSum2(myArr);
        m1.display();
        m2.display();
        sc.close();
    }
    
}
