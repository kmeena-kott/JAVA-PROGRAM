public class ArithmeticOperator {

    public static void main(String args[]) {

        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

        int c = 25;

        System.out.println("b % a = " + (b % a));   // Modulus Operator
        System.out.println("c % a = " + (c % a));

        // Post and pre increment, post and pre decrement

        int e = 10;
        int d = 25;

        System.out.println("e++ = " + (e++));
        System.out.println("e-- = " + (e--));

        // Check the difference in d++ and ++d

        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
}