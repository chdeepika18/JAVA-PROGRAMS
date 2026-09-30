class Student2 {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student2 s = new Student2(); 
        s.name = "Rahul";
        s.marks = 85;
        s.display();
    }
}
