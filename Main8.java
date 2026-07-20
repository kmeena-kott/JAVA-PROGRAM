public class Main {

    // Called Function
    // Variable a and b is the Formal Parameter
    // Mapping: a = 10 and b = 20
    static void sum(int a, int b) {
        int c;
        c = a + b;

        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    public static void main(String args[]) {

        // Calling Function
        // 10,20 is the Actual Parameter.
        sum(10, 20);
    }
}n