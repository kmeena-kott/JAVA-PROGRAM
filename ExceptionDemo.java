class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
            System.out.println(result);
        }
        catch (Exception e) {
            // handling the exception by using Exception class
            System.out.println(e);
        }
    }
}