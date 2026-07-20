import java.util.Scanner;

public class EmployeeManagementSystem {

    static int id;
    static String name;
    static double salary;

    static void getDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    static void displayDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Salary  : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getDetails(sc);

        System.out.println("\n===== Employee Records =====");
        displayDetails();

        sc.close();
    }
}