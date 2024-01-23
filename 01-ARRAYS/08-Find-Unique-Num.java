// Q : Find the number that appears once in a list  where, all other numbers appears twice.

import java.util.ArrayList;

public class FindUnique {

    public static int Bruteforce(ArrayList<Integer> A){
        int unique = -1;

        for(int i=0; i<A.size(); i++){
            int count = 0;
            for(int j=0; j<A.size(); j++){
                if(A.get(i) == A.get(j)){
                    count++;
                }
            }

            if(count == 1) unique = A.get(i);
        }
        return unique;
    }

    public static int Optimal(ArrayList<Integer> A){
        int xor = 0;
        for(Integer num: A){
            xor =  xor ^ num;
        }
        return xor;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(6);
        A.add(1);
        A.add(0);
        A.add(2);
        A.add(6);
        A.add(2);
        A.add(10);
        A.add(0);

        System.out.println(Bruteforce(A));
        System.out.println(Optimal(A));
    }
}
