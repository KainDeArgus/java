import java.util.ArrayList;
import java.util.List;

public class LabClassDriver {
    public static void main(String[] args) {
        Student oleg = new Student("Oleg", 18, 0);
        Student genadiy = new Student("Genadiy", 184, 4.5);
        Student kirilliy = new Student("Kirilliy", 45, 0);
        Student oksaniy = new Student("Oksaniy", -1, Double.MIN_VALUE+1);
        Student[] students = new Student[]{oleg, genadiy, kirilliy, oksaniy};
        LabClassUI labClassUI = new LabClassUI(new ArrayList<Student>(List.of(students)));
    }
}