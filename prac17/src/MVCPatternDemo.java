public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Avel");
        controller.setStudentRollNo("111");
        System.out.println("\nAfter updating,Student Details are as follows\n");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Kain");
        student.setRollNo("999");
        return student;
    }
}