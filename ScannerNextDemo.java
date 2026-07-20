import java.util.Scanner;

class ScannerNextDemo {
    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // reads the entire word
        String value = sc.next();

        System.out.println("Using next(): " + value);

        sc.close();
    }
}