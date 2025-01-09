package Array_c;


public class ReverseArrays {

    public static void  Revers(int numbers[]) {

        int first = 0 , last = numbers.length - 1; // yaha pere mera first index 0 hai or last index n-1 hai

        while (first < last) {

            // swap
            int temp = numbers[last];
            numbers[last] =numbers[first];
            numbers[first] = temp;

            first ++; // yaha per mera first element aage badega
            last --; // or yaha per mera last element aage aayega to swap ho jayega
        }

    }

    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10};

        //calling function
        Revers(numbers);
        // printing an array
        for( int i = 0; i < numbers.length; i++){

            System.out.println(numbers[i] + " ");
        }

        // System.out.println();
    }

}
