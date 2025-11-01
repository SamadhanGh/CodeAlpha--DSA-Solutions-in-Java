package Array_assighnment;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid; // Found exact match
            } else if (nums[mid] > target) {
                end = mid - 1; // Target is on left side
            } else {
                start = mid + 1; // Target is on right side
            }
        }

        // If not found, return the insert position
        return start;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 10, 12, 14};
        int target = 8;
        int result = searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
}
