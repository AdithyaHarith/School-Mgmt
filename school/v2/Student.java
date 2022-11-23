package school.v2;

public class Student {
    private String name;
    private String rollNo;
    private int age;
    private String std;
    private Marks marks;

    public Student(String name, String rollNo, int age, String std, Marks marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.std = std;
        this.marks = marks;
    }

    public void displayProgressReport() {
        System.out.println("Name: "+ name);
        System.out.println("RollNo: "+ rollNo);
        System.out.println("Age: "+ age);
        System.out.println("Std: "+ std);
        marks.displayMarks();
    }
}
