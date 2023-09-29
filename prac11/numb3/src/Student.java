import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private Date bd;

    public void setBd(Date bd) {
        this.bd = bd;
    }

    private final String name;
    private final int age;
    private final double GPA;

    public double getGPA() {
        return GPA;
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        GPA = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Character.compare(this.name.charAt(0), o.name.charAt(0));
    }

    @Override
    public String toString() {
        return "Student " + name + " age: " + age + " with GPA = " + GPA;
    }
    public static void swap(Student[] students, int indF, int indS) {
        Student swap = students[indF];
        students[indF] = students[indS];
        students[indS] = swap;
    }

    public void outDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("dd.MM.yyyy HH:mm:ss");
        System.out.println("h:mm");
        System.out.println("dd-MMM-yyyy");
        String format = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(bd));
    }
}
