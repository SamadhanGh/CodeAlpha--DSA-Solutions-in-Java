package ArrayList_Class;

import java.util.ArrayList;

public class SizeOfArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.println(List.size());

        //Print the ArrayList
        for (int i =0; i<List.size();i++) {

            System.out.print(List.get(i) + " ");
        }
        System.out.println();

    }
}
