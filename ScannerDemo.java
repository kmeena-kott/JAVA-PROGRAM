import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("You entered " + number);

        // closing the scanner object
        sc.close();
    }
}