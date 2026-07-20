import java.util.Scanner;

public class Main3 {

    public static int minHouses(int r, int unit, int[] arr) {

        if (arr == null)
            return -1;

        int foodNeeded = r * unit;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum >= foodNeeded) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minHouses(r, unit, arr));

        sc.close();
    }
}