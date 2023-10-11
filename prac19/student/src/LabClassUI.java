import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class LabClassUI extends JFrame {
    LabClass labClass;
    JButton addButton;
    JButton infAddButton ;
    JButton infDeleteButton ;
    JButton infSearchButton ;
    JButton deleteButton;
    JButton searchButton;
    JTextField textField;
    public LabClassUI(ArrayList<Student> students) {
        super("Students");
        labClass = new LabClass(students);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        addButton = new JButton("Add student");
        infAddButton = new JButton("?");
        infDeleteButton = new JButton("?");
        infSearchButton = new JButton("?");
        deleteButton = new JButton("Delete student");
        searchButton = new JButton("Search student");
        textField = new JTextField();

        infAddButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "For adding student input his name, age and gpa");
        });
        infDeleteButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "For removing student input his name");
        });
        infSearchButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "For search student input his name");
        });

        addButton.addActionListener(e -> {
            Student student;
            String infStudent = textField.getText();
            if (Objects.equals(infStudent, ""))
                throw new EmptyStringException();
            else {
                String[] information = infStudent.split(" ");
                try {
                    student = new Student(information[0], Integer.parseInt(information[1]), Integer.parseInt(information[2]));
                    labClass.addStudent(student);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(this,
                            "Your input is not correct");
                }
            }
            updateUI();
        });
        deleteButton.addActionListener(e -> {
            try {
                String infStudent = textField.getText();
                if (Objects.equals(infStudent, ""))
                    throw new EmptyStringException();
                else
                    labClass.deleteStudent(infStudent);
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
            updateUI();
        });
        searchButton.addActionListener(e -> {
            try {
                String infStudent = textField.getText();
                if (Objects.equals(infStudent, ""))
                    throw new EmptyStringException();
                else {
                    Student student = labClass.searchStudent(infStudent);
                    JOptionPane.showMessageDialog(this,
                            student);
                }
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
            updateUI();
        });

        updateUI();
    }

    public void updateUI() {
        JPanel main_panel = new JPanel();
        GridLayout container_layout = new GridLayout(1, 2);
        main_panel.setLayout(container_layout);

        JPanel student_panel = new JPanel();
        GridLayout student_container = new GridLayout(labClass.students.size(),1);
        student_panel.setLayout(student_container);

        JPanel UI_panel = new JPanel();
        GridLayout container_UI = new GridLayout(4, 1);
        UI_panel.setLayout(container_UI);

        for(int i = 0; i < labClass.students.size();i++){
            JTextField jTextField = new JTextField(String.valueOf(labClass.students.get(i)));
            student_panel.add(jTextField);
        }

        UI_panel.add(textField);

        JPanel addPanel = new JPanel(new GridLayout(1, 2));
        addPanel.add(infAddButton);
        addPanel.add(addButton);
        UI_panel.add(addPanel);

        JPanel deletePanel = new JPanel(new GridLayout(1, 2));
        deletePanel.add(infDeleteButton);
        deletePanel.add(deleteButton);
        UI_panel.add(deletePanel);

        JPanel searchPanel = new JPanel(new GridLayout(1, 2));
        searchPanel.add(infSearchButton);
        searchPanel.add(searchButton);
        UI_panel.add(searchPanel);

        main_panel.add(UI_panel);
        main_panel.add(student_panel);
        this.getContentPane().removeAll();
        this.repaint();
        this.add(main_panel);
        this.setVisible(true);
    }
}
