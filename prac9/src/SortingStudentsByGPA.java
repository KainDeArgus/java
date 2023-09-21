import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGPA(), o2.getGPA());
    }

    public void QuickSort(Student[] students) {
        QuickSort(students, 0, students.length - 1);
    }

    private void QuickSort(Student[] students, int leftS, int rightS) {
        if (leftS >= rightS)
            return;
        int iteratorPivot = Partition(students, leftS, rightS);
        QuickSort(students, leftS, iteratorPivot);
        QuickSort(students, (iteratorPivot + 1), rightS);
    }

    private int Partition(Student[] students, int leftS, int rightS) {
        Student pivot = students[(leftS + rightS) / 2];
        int iteratorLeft = leftS;
        int iteratorRight = rightS;
        while (iteratorLeft <= iteratorRight) {
            while (compare(students[iteratorLeft], pivot) > 0)
                iteratorLeft++;
            while (compare(students[iteratorRight], pivot) < 0)
                iteratorRight--;
            if (iteratorLeft >= iteratorRight)
                break;
            Student.swap(students, iteratorLeft++, iteratorRight--);
        }
        return iteratorRight;
    }
}
