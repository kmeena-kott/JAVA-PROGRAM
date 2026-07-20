class Stringcheck {
    public static void main(String args[]) {

        // creating string using string literal
        String s1 = "Hello";
        String s2 = "Hello";

        // creating strings using new keyword
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        if (s1 == s2)
            System.out.println("String s1 and s2 are equal");
        else
            System.out.println("String s1 and s2 are NOT equal");

        if (s3 == s4)
            System.out.println("String s3 and s4 are equal");
        else
            System.out.println("String s3 and s4 are NOT equal");
    }
}