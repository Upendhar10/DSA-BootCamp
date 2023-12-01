/*

    Q : Find Second Smallest and largest element in the given array

    Optimal Approach :
        Algo :
            1. Take 4 variables and initialize with
                small = Integer.MAX_VALUE;
                large = Integer.MIN_VALUE;

                sndSmall = Integer.MAX_VALUE;
                sndLarge = Integer.MIN_VALUE;

            2. Run a loop , and in every iteration compare
                a. Element of array with smallest element
                b. Element of array with second smallest element

            3. Finally , print the sndSmall and sndLarge element as result


        Complexity : Time : 0(n) + 0(n) => 0(n)
                    Space : 0(1)

*/

public class SecondSmallestLargestElement {

    public static void Optimal(int[] arr){

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        int sndSmall = Integer.MAX_VALUE;
        int sndLarge = Integer.MIN_VALUE;

        //Find the smallest and largest element
        for(int i = 0; i < arr.length; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        // find second smallest
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < small){
                small = arr[i];
                sndSmall = small;
            }else if (arr[i] < sndSmall && arr[i] != small){
                sndSmall = arr[i];
            }
        }

        // second largest element
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > large){
                large = arr[i];
                sndLarge = large;
            }else if(arr[i] > sndLarge && arr[i] != large){
                sndLarge = arr[i];
            }
        }

        System.out.println("Second Smallest element : " + sndSmall);
        System.out.println("Second Largest element : " + sndLarge);

    }

  // Main function 
    public static void main(String[] args) {
        int[] arr = {12,17,13,0,-1,19};
        Optimal(arr);
    }
}

