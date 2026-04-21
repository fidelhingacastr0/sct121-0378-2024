import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Accept marks from the user
        System.out.print("Enter student's marks (0-100): ");
        int marks = sc.nextInt();

        // Step 2: Use if-else if ladder to determine grade
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered!");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
            System.out.println("Remark: Excellent");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remark: Very Good");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remark: Good");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
            System.out.println("Remark: Pass");
        } else {
            System.out.println("Grade: E");
            System.out.println("Remark: Fail");
        }
    }
}