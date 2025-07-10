package ArrayList_Class;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(3);
        List.add(5);
        List.add(6);
        List.add(0);

        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);

        //deceding order
        Collections.sort(List,Collections.reverseOrder());
        //Comparator - fnx logic
        System.out.println(List);

    }
}
