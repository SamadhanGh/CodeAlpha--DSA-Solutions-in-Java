//Arrays as function argument

package Array_class;

public class AasFun_argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){

            marks[i] = marks[i] + 1;

        }

    }
    public static void main(String[] args) {

        int marks[] = {13,34,54};
        update(marks);
        for(int i=0;i<marks.length;i++){

            System.out.print(marks + " ");
        }

        System.out.println();


    }
}

