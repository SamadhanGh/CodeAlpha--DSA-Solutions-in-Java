package Array_class;


public class BinarySerach {


    public static int BinarySearch(int numbers[], int  key){

        int start = 0 , end = numbers.length - 1 ; // yaha per first strat hoga 0 se or end hoga n-1 se

        while (start<= end) {
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key ){  // found
                return mid;
            }
            if(numbers[mid] < key ){ //right
                start =  mid+1;
            }
            if(numbers[mid] > key ){ // left
                end = mid -1;
            }

        }

        return -1; // for key is not exits

    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 10;
        int key = 6;

        //search

        System.out.println("index for key is : " + BinarySearch(numbers, key));

    }

}




