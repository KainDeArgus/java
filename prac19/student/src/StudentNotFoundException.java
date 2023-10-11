public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Student  " + name + " not found");
    }
}