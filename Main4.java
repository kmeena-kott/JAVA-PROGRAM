import java.util.*;
class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int foodRequired = r * unit;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum >= foodRequired) {
                result = i + 1;
                break;
            }
        }

        if (sum < foodRequired)
            System.out.println(0);
        else
            System.out.println(result);

        sc.close();
    }
}