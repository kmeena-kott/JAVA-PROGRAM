class ArrayDemo {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");

        for (int i = 0; i < 5; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }
    }
}