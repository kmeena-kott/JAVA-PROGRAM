public class StringDemo {

    public static void main(String[] args) {

        // String literal
        String s1 = "Hello Java";
        System.out.println(s1);

        // Using String Constructor
        String s2 = new String("Hello Java");
        System.out.println(s2);

        // Converting the character array into strings
        char n[] = {'H', 'a', 'r', 'i'};
        String s3 = new String(n);
        System.out.println(s3);
    }
}