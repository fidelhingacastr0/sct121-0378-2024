import java.util.scanner;
public class UserInfo.java
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your full name: "); 
String name = input.nextLine();
System.out.print("Enter your age: ");
int age = input.nextInt();
System.out.print( " Enter your height in meters: ");
double height = input.nextDouble();
System.out.printIn("\nWelcome, " + name + "!");
System.out.printIn("You are " + age + " years old and " + height + " meters tall.");
input.close();
}
}
