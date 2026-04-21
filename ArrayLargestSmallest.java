import java.util.Scanner;

public class ArrayLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Accept size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Accept array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Initialize largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        // Step 4: Traverse array to find largest and smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Step 5: Display results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
