package ArrayList_Class;

import java.util.ArrayList;

public class ContainerWithMostWaterBruteForce {

    public static int stroreWater(ArrayList<Integer> height) {
        //Global |Variable
        int maxWater = 0;
        //Brute Force = O(n^2)
        for (int i =0;i<height.size();i++){
            for (int j=i+1;j<height.size();j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currentWater = ht * width;
                maxWater = Math.max(maxWater,currentWater);
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

        System.out.println(stroreWater(height));

    }
}


//Time complexity = O(n^2)