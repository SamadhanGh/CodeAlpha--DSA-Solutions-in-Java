package ArrayList_Class;

import java.util.ArrayList;

public class ContainerWithMostWaterOptimal {

    //2 -Pointer Approch - O(n)
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1; //n-1

        while(lp < rp) {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp) );
            int width = rp - lp;
            int currentWater = ht * width;
            maxWater = Math.max(maxWater,currentWater);


            //update the ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
