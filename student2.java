class Student3 {
    int rollno;
    String name;
    int age;
    Student3(){}//define deafault constructor manually
    //parameter constructor with two parameter
    Student3(int rollno, String name) {
        this.rollno = rollno;//if LHS+RHS  we using this
        this.name = name;
    }
    //parameter constructor with three parameter
    //Method overloading or constructor overloading
    Student3(int rollno, String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age=age;
    }
    void displayInformation(){
           System.out.println(rollno+" "+name+" "+age);
    }      
}
class StudentMain{
    public static void main(String args[]) {
        Student3 s1 = new Student3(111, "Senthil",25);
        Student3 s2 = new Student3(222, "Ram");
        Student3 s3 = new Student3();
        s1.displayInformation(); 
        s2.displayInformation();
        s3.displayInformation();
    }
}