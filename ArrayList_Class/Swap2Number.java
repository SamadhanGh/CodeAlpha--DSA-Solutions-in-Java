package ArrayList_Class;

import java.util.ArrayList;

public class Swap2Number {

    public static void swap( ArrayList<Integer> List , int idx1, int idx2) {

        int temp = List.get(idx1);
        List.set(idx1,  List.get(idx2));
        List.set(idx2, temp);

    }
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(3);
        List.add(6);
        List.add(7);
        List.add(9);
        List.add(1);

        int idx1 =1 , idx2 = 3;
        System.out.println(List);
        swap(List,idx1,idx2);
        System.out.println(List);
     }
}
