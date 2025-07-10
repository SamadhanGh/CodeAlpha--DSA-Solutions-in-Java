package ArrayList_Class;

import java.util.ArrayList;

public class MaximumInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        // Find Maximum in the ArrayList
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < List.size(); i++) {
//            max = Math.max(max, List.get(i));
//        }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < List.size(); i++) {
                if (List.get(i) > max) {
                    max = List.get(i);
                }
            }


            System.out.println("The Max Element is " + max);
    }
}
