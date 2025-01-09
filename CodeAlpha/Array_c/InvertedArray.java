package Array_c;

public class InvertedArray {

    // Function to search for a target in the rotated sorted array
    public static int invertedSearch(int[] nums, int target) {
        // Get the index of the smallest element in the rotated array
        int min = minSearch(nums);

        // Determine which sorted part of the array to search
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target); // Search in the right sorted part
        } else {
            return search(nums, 0, min - 1, target); // Search in the left sorted part
        }
    }

    // Function to find the index of the smallest element in the rotated sorted array
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid; // Found the smallest element
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1; // Move to the unsorted part
            } else {
                right = mid; // Move to the unsorted part
            }
        }
        return left;
    }

    // Binary search in a sorted portion of the array
    public static int search(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target
            } else if (nums[mid] < target) {
                left = mid + 1; // Move to the right
            } else {
                right = mid - 1; // Move to the left
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 1, 2, 3};
        int target = 5;

        int pos = invertedSearch(array, target);
        System.out.println(pos); // Output the index of the target
    }
}

