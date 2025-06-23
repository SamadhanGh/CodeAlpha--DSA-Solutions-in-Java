package DivideAndConquer_Class;

public class QuckSort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int Pidx = partition(arr, si, ei);
        quickSort(arr, si, Pidx - 1); // left
        quickSort(arr, Pidx + 1, ei); // right
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap pivot to correct position
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}
