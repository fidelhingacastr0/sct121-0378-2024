public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("=== USING CONTINUE ===");
        // Print odd numbers between 1 and 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println(i);
        }

        System.out.println("\n=== USING BREAK ===");
        // Print numbers until 5, then stop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit loop when i = 5
            }
            System.out.println(i);
        }
    }
}
