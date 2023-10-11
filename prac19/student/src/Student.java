public class Student implements Comparable<Student> {
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
        for (int i = 0; i < Math.min(o.name.length(), this.name.length()); i++) {
            if(this.name.charAt(i) != o.name.charAt(i))
                return Character.compare(this.name.charAt(i), o.name.charAt(i));
        }
        return 0;
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

    public static Student[] mergeSort(Student[] leftArr, Student[] rightArr) {
        Student[] resultSort = new Student[leftArr.length + rightArr.length];
        System.arraycopy(leftArr, 0, resultSort, 0, leftArr.length);
        System.arraycopy(rightArr, 0, resultSort, leftArr.length, rightArr.length);
        return mergeSort(resultSort, 0, resultSort.length - 1);
    }

    static Student[] mergeSort(Student[] resultSort, int leftS, int rightS) {
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
}
