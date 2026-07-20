import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        // Create an array
        int[] age = new int[n];

        // Enter the age value dynamically
        System.out.println("Enter the value of age:");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        // Access each array element
        System.out.println("Accessing Elements of Array:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }
    }
}