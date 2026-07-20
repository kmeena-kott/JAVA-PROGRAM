class Students {
    int rollno;
    String name;

    Students(int r, String n) {
        rollno = r;
        name = n;
    }

    void insertRecord(int r , String n) {
        rollno=r;
        name=n;
    }
    void displayInformation(){
           System.out.println(rollno+" "+name);
    }
    public static void main(String args[]) {
        Students s1 = new Students(111, "Senthil");
        Students s2 = new Students(222, "Ram");
        s1.displayInformation();
        s2.displayInformation();
    }
}