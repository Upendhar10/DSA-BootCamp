/*
    LINEAR-SEARCH-ALGORITHM :
    - Linear Search is the simpliest searching algorithm
    - The idea of the Linear search is to start searching for the required element by comaring with all other elements of the list
    - Linear search is majorily implemented to 
      - find wheather a specific element exists in the list or not
      - find of the count of the specific element in the list
*/ 

public class LinearSearch {
  
    public static int linearSearch(int arr[],int target){

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
  
  // Main function
    public static void main(String[] args) {
        int [] arr = {2,4,6,9,11,12,14,20,36,48};
        System.out.println(linearSearch(arr,11));
    }
}
