import java.util.Scanner;

public class ArraySearch {
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

        // Step 3: Accept search element
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        // Step 4: Linear search
        boolean found = false;
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                found = true;
                position = i; // store index
                break;        // stop once found
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println(search + " found at position " + (position + 1));
        } else {
            System.out.println(search + " not found in the array.");
        }
    }
}
