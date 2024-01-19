public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int pass = 0; pass < n - 1; pass++) {
            int minIndex = pass;

            for (int value = pass + 1; value < n; value++) {
                // Find the index of the minimum element
                if (array[value] < array[minIndex]) {
                    minIndex = value;
                }
                // if(array[value] > array[minIndex] // decending order

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[pass];
            array[pass] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);

        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
