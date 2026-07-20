import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buying price: ");
        double buyingPrice = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        System.out.printf("Buying price is %.2f%n", buyingPrice);
        System.out.printf("Selling price is %.2f%n", sellingPrice);

        sc.close();
    }
}