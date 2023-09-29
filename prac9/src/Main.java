import java.util.Arrays;

public class Main {
    public static void PrintStudents(Student[] students) {
        for (Student student : students)
            System.out.println(student);

    }

    public static void InsertSort(Student[] students) {
        for (int i = 1; i < students.length; i++)
            for (int j = i; j > 0 && students[j].compareTo(students[j - 1]) < 0; j--)
                Student.swap(students, j, (j - 1));
    }

    public static Student[] mergeSort(Student[] leftArr, Student[] rightArr) {
        Student[] resultSort = new Student[leftArr.length + rightArr.length];
        System.arraycopy(leftArr, 0, resultSort, 0, leftArr.length);
        System.arraycopy(rightArr, 0, resultSort, leftArr.length, rightArr.length);
        return mergeSort(resultSort, 0, resultSort.length - 1);
    }

    private static Student[] mergeSort(Student[] resultSort, int leftS, int rightS) {
        if (leftS == rightS)
            return resultSort;
        int middle = (leftS + rightS) / 2;
        Student[] leftArr = new Student[middle - leftS + 1];
        System.arraycopy(mergeSort(resultSort, leftS, middle), leftS, leftArr, 0, middle - leftS + 1);

        Student[] rightArr = new Student[rightS - middle];
        System.arraycopy(mergeSort(resultSort, middle + 1, rightS), middle + 1, rightArr, 0, rightS - middle);

        int iteratorLeftArr = 0, iteratorRightArr = 0;
        for (int i = leftS; i <= rightS; i++) {


            if (iteratorLeftArr <= (middle - leftS) && iteratorRightArr <= (rightS - middle - 1)) {
                if (leftArr[iteratorLeftArr].compareTo(rightArr[iteratorRightArr]) < 0) {
                    resultSort[i] = leftArr[iteratorLeftArr];
                    iteratorLeftArr++;
                } else {
                    resultSort[i] = rightArr[iteratorRightArr];
                    iteratorRightArr++;
                }
            } else if (iteratorLeftArr <= (middle - leftS)) {
                resultSort[i] = leftArr[iteratorLeftArr];
                iteratorLeftArr++;
            } else {
                resultSort[i] = rightArr[iteratorRightArr];
                iteratorRightArr++;
            }
        }
        return resultSort;
    }

    public static void main(String[] args) {
        Student oleg = new Student("Oleg", 18, 0);
        Student genadiy = new Student("Genadiy", 184, 4.5);
        Student kirilliy = new Student("Kirilliy", 45, 0);
        Student oksaniy = new Student("Oksaniy", -1, Double.MIN_VALUE+1);
        Student[] iDNumber = {oleg, genadiy, kirilliy, oksaniy};

        InsertSort(iDNumber);
        PrintStudents(iDNumber);
        System.out.println();

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.QuickSort(iDNumber);
        PrintStudents(iDNumber);
        System.out.println();

        Student sergeyiy = new Student("Sergeyiy", 18, 5);
        Student vladimiriy = new Student("Vladimiriy", 184, 4.5);
        Student konstanciyaiy = new Student("Konstanciyaiy", 45, 2.4);
        Student tatyaniy = new Student("Tatyaniy", -1, 3.6);
        Student[] iDNumberS = {sergeyiy, vladimiriy, konstanciyaiy, tatyaniy};
        PrintStudents(mergeSort(iDNumber, iDNumberS));

    }
}