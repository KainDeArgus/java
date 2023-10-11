import java.util.ArrayList;
import java.util.Arrays;

public class LabClass {
    ArrayList<Student> students;

    public LabClass(ArrayList<Student> students) {
        Student[] arr_students = students.toArray(new Student[0]);
        Student.mergeSort(arr_students, 0, students.size() - 1);
        this.students = new ArrayList<>(Arrays.asList(arr_students));
    }

    public void mergeSort(){
        Student[] arr_students = students.toArray(new Student[0]);
        Student.mergeSort(arr_students, 0, students.size() - 1);
        students = new ArrayList<>(Arrays.asList(arr_students));
    }
    public void addStudent(Student student) {
        students.add(student);
        mergeSort();
    }

    public void deleteStudent(String nameStudent) throws StudentNotFoundException {
        students.remove(searchStudent(nameStudent));
    }

    public Student searchStudent(String nameStudent) throws StudentNotFoundException {
        Student studentFind = new Student(nameStudent, 0, 0);
        int left = 0;
        int right = students.size() - 1;
        while (left<=right){
            int middle = (left + right)/2;
            Student student = students.get(middle);
            if(studentFind.compareTo(student)==0)
                return student;
            if(studentFind.compareTo(student)<0)
                right = middle -1;
            if(studentFind.compareTo(student)>0)
                left = middle + 1;
        }
        throw new StudentNotFoundException(nameStudent);
    }
}
