package school.v2;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
       // List<Student> students=new ArrayList<>();
        Marks marks=new Marks(20,33,44,55,66);
        Marks marks1=new Marks(33,66,80,90,56);
        Marks marks2=new Marks(78,89,90,45,99);

        Student s1 = new Student("ritheen","1234",10,"III",marks);
        Student s2 =new Student("harshan","5234",5,"I",marks1);
        Student s3 =new Student("arjun","1986",13,"II",marks2);

        s1.displayProgressReport();
        s2.displayProgressReport();
        s3.displayProgressReport();
    }
}
