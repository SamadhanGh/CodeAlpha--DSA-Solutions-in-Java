package ArrayList_Class;

import java.util.ArrayList;

public class MultiDimentionalArraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1); List.add(2);
        mainList.add(List);


        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(3); List2.add(4);

        for (int i = 0; i <mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j=0 ; j<currList.size();j++) {
                System.out.println(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
