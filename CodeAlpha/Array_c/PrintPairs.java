package Array_c;


public class PrintPairs {

    public static void PrintPairs(int numbers[]){

        int tp = 0;

        for(int i = 0;i<numbers.length; i++){

            int curr = numbers[i]; // 2,4,6,8,10

            for(int j = i+1;j<numbers.length;j++){

                System.out.println("( " + curr + ", " + numbers[j] + ")");

                tp ++;

            }

            System.out.println();
        }
        System.out.println("total pairs is the = "+ tp);

    }



    public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10};

        PrintPairs(numbers);

    }

}

