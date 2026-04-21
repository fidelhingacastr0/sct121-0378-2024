import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Accept size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Step 2: Accept array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // accumulate sum
        }

        // Step 3: Calculate average
        double average = (double) sum / n;

        // Step 4: Display results
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
