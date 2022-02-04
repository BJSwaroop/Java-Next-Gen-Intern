package Practice.Sorting;
import Practice.getArrayInput;

public class sortArray {
    public static void main(String[] args){
        
        getArrayInput arr = new getArrayInput();
        int[] myArr = arr.getArray();
        // bubbleSort bubble = new bubbleSort(myArr);
        // insertionSort insert = new insertionSort(myArr);
        selectionSort select = new selectionSort(myArr);
        countingSort count = new countingSort(myArr);

        // bubble.display();
        // insert.display();
        select.display();
        count.display();
    }
}
