package ArrayList_Class;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
//import java.util.*;
public class ArrayListClass {

    public static void main(String[] args) {

        //Java Collection Framework
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<String>  List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();

        // Operation on the Arraylist
        //Add Element
        List1.add(1); //O(n)
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
        System.out.println(List1);

        List1.add(1,9); //O(n) Linear time
        System.out.println(List1);



        //Get Element - O(n)
//        int element  = List1.get(1);
//        System.out.println(element);

        //Delete
//        List1.remove(2);
//        System.out.println(List1);

        //Set Element At Index
//        List1.set(2,19);
//        System.out.println(List1);

        //Containes
//        System.out.println(List1.contains(1));
//        System.out.println(List1.contains(19));



    }
}
