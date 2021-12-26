package Practice;
import java.util.Scanner; //scanner is a class
public class dupElem
{
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n,c = 0;
    System.out.println("Enter size of the Array: ");
    n = sc.nextInt();
    int[] myArr = new int[n];
    
    System.out.println("Enter elements in Array: ");
    for( int i = 0;i<n;i++){
        myArr[i] = sc.nextInt();
    }    
    int j = 0;
    for(int i = 0; i<n-1;i++){
        for( j =i+1; j<n; j++){
            if( myArr[i] == myArr[j]){
                c++;
            }
        }
    }
    if(c>=1){
        System.out.println("Duplicate Elements Exist");
    }
    else{
        System.out.println("No Duplicate Elements Exist");
    }
    sc.close();
    }
}