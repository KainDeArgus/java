public class Student implements MyComparable<Student> {
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
}
