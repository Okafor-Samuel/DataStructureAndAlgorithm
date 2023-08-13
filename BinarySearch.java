
public class Main {

        public static void main(String[] args) {
            int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
            int target = 23; // Change this to the element you want to find

            int index = binarySearch(sortedArray, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index " + index);
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        }

        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // Element found
                } else if (array[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }

            return -1; // Element not found
        }

}
