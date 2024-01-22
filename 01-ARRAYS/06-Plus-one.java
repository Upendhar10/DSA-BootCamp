
public class plusOneAL {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        for(int i=A.size()-1; i>=0; i--){

            if(A.get(i) < 9){
                A.set(i,A.get(i)+1);
                return A;
            }else{
                A.set(i,0);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < A.size()+1; i++) {
            ans.add(i,0);
        }
      
        ans.set(0,1);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
      
        al.add(6);
        al.add(0);
        al.add(9);
      
        System.out.println(plusOne(al));

    }
}
