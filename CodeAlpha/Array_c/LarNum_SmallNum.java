//LARGEST NUMBERS AND SMALLEST NUMBERS


package Array_c;

public class LarNum_SmallNum {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - INFINITY
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest value is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 6, 7, 4, 9, 10};

        System.out.println("The largest value is: " + getLargest(numbers));
    }
}

