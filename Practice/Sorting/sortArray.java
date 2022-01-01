package Practice.Sorting;
import Practice.getArrayInput;

public class sortArray {
    public static void main(String[] args){
        
        getArrayInput arr = new getArrayInput();
        int[] myArr = arr.getArray();
        // bubbleSort bubble = new bubbleSort(myArr);
        insertionSort insert = new insertionSort(myArr);
        insert.display();
    }
}
