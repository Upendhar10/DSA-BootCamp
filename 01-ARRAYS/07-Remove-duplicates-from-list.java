
import java.util.ArrayList;
import java.util.HashSet;

public class Remove_duplicates {

    // NOTE: HashSet doesn't maintain the relative order, whereas ArrayList maintains.

    // using HashSet 
    public static HashSet<Integer> Bruteforce(ArrayList<Integer> list){

        HashSet<Integer> hs = new HashSet<>(list);
        return hs;
    }

    // using ArrayList
    public static ArrayList<Integer> better(ArrayList<Integer> arr){
        int n = arr.size();

        ArrayList<Integer> al = new ArrayList<>();

        int a = arr.get(0);
        al.add(a);

        for(int i=1; i<n; i++){
            if(a == arr.get(i)){
                continue;
            }else{
                a = arr.get(i);
                al.add(a);
            }
        }
        return al;
    }

  
    // Main function
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(16);
        list.add(22);
        list.add(22);
        list.add(30);
        list.add(32);
        list.add(32);
        list.add(41);

        System.out.println(Bruteforce(list));
        System.out.println(better(list));
    }
}

