class PersonMain {

    public static void main(String[] args) {

        // create an object of Person
        Person p1 = new Person();
        // change age using setter
        p1.setAge(24);
p1.setName("Aathi");
p1.setMobileno(9003170108L);

System.out.println("My age is " + p1.getAge());
System.out.println("My Name is " + p1.getName());
System.out.println("My MobileNumber is " + p1.getMobileno());

}
}