
public class Main {

    public static long findNextSquare(long num) {
        // Find the square root of the input number
        long sqrt = (long) Math.sqrt(num);

        // Check if the square of the square root is equal to the input number
        if (sqrt * sqrt == num) {
            // Increment the square root and return the square of the incremented value
            sqrt++; // Move to the next integer
            return sqrt * sqrt; // Return the square of the incremented value
        } else {
            // If the input is not a perfect square, return -1
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(findNextSquare(121)); // Output: 144
        System.out.println(findNextSquare(625)); // Output: 676
        System.out.println(findNextSquare(114)); // Output: -1
    }
}
