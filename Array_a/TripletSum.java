package Array_a;

public class TripletSum {
    static int tripletSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){ //first number
            for(int j = i+1; j < n; j++){ //second number
                for(int k = j+1; k < n; k++){ //third number
                    if(arr[i] + arr[j] + arr[k] == 0){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {-1,0,1,2,-1,-4};

        System.out.println(tripletSum(arr, 0));
    }
}

