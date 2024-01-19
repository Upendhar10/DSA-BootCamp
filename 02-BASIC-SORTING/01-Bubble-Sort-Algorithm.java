
import java.util.Arrays;

public class BubbleSortAlgo {

    public static void bubbleSort(int arr[]){

        int n = arr.length;

        // i => No.of Pass
        for(int i = 0; i < n; i++){
            // j => array elements
            int swap = 0;
            for(int j = 0; j < n-i-1; j++){
//                Ascending order : arr[j] > arr[j+1]   => 1,2,3,,4,5
//                Descending order : arr[j] < arr[j+1]  => 5,4,3,2,1
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }

            if(swap < 0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,1,5,4,2};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
