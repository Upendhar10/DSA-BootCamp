
public class MoveZerosEnd {

    public static int[] Bruteforce(int[] arr){

        int n = arr.length;
        int[] ans = new int[arr.length];
        int k = 0;

        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans[k++] = arr[i];
            }
        }

        for(int i=0; i<n-k; i++){
            ans[k++] = 0;
        }

        return ans;
    }


    public static void Optimal(int[] arr){

        // find the index of the first zero
        int j = -1;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // use (i) to target non-zero elements.
        // use (j) to target zero elements.
        for(int i=j+1; i< arr.length; i++){
            if(arr[i] != arr[j]){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // Main function

    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,3,0,0};

        int[] res = Bruteforce(arr);
        for (int num: res){
            System.out.print(num+" ");
        }
      
        System.out.println();

        Optimal(arr);
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
}
