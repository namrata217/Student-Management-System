
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter roll number: ");
        s.rollNumber = s1.nextInt();
        s1.nextLine(); // Consume leftover newline

        System.out.print("Enter name: ");
        s.name = s1.nextLine();

        System.out.print("Enter email: ");
        s.email = s1.nextLine();

        System.out.print("Enter course: ");
        s.course = s1.nextLine();

        System.out.println("\n--- Student Details ---");
        s.displayDetails();

        s1.close();
    }
}

