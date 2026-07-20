import java.util.Scanner;

class rat {

    public static int food(int r, int unit, int[] arr) {

        if (arr == null) {
            return -1;
        }

        int requiredFood = r * unit;
        int totalFood = 0;

        for (int i = 0; i < arr.length; i++) {
            totalFood += arr[i];

            if (totalFood >= requiredFood) {
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

        System.out.println(food(r, unit, arr));

        sc.close();
    }
}