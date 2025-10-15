package Array_class;


public class  TrappingRainWater{

    public static  int TrappedWater(int height[]){

        //Step1: Calculate the left max boundary
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1;i<n;i++) {

            leftMax[i] = Math.max(height[i],leftMax[i-1]);

        }
        //Step2: Calculate the right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for (int i = n-2; i>=0;i--) {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        int trappedWater = 0;

        //loop
        for (int i =0;i<n;i++) {

            //WaterLevel = min(leftMax Boundary , Rightmax Boundary)
             int WaterLevel = Math.min(leftMax[i],rightMax[i] );

             //Trapped Water = Waterlevel - Height of the bar

             trappedWater += WaterLevel - height[i];
        }
        return trappedWater;

    }


    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};

        System.out.println("the water are trapped is "+ TrappedWater(height));

    }



}





//public class TrappingRainWater {
//
//    public static int trappedRainWater(int height[]) {
//        // step1 : calculate the left max - array
//        int n = height.length;
//         int leftMax[] = new int[n];
//          leftMax[0] = height[0];
//
//          for (int i = 1 ; i <n; i++) {
//              leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//
//          }
//
//        // step2 : calculate the right max - array
//
//        int rightMax[] = new int[n];
//
//          rightMax[n-1] = height[n-1];
//
//          for (int i = n-2; i>=0; i--) {
//              rightMax[i] = Math.max(height[i] , rightMax[i+1]);
//          }
//
//    int trappedWater = 0;
//        //loop
//        for (int i =0; i<n; i++){
//            //waterLevel = min(leftmax Bound , Right max bound)
//            int waterlevel = Math.min(leftMax[i], rightMax[i]);
//
//            //trapped Water = water level - height[i]
//
//            trappedWater += waterlevel - height[i];
//        }
//        return trappedWater;
//
//    }
//    public static void main(String[] args) {
//
//        int heigth[] = {4,2,0,6,3,2,5};
//
//        System.out.println("Trapped Water = " + trappedRainWater(heigth));
//
//    }
//}
