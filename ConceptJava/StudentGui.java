import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentBean{ 
    private String name;
    private int rollno;
    private String grade;

    public StudentBean(){}
    public StudentBean(String name, int rollno, String grade){
        this.name = name;
        this.rollno=rollno;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void displayStudentDetails(){
        System.out.println("Student Details:- ");
        System.out.println("Name: "+name
        +"\nRoll No: "+rollno
        +"\nGrade: "+grade
        );
    }
}

public class StudentGui{
    public static void main(String [] args){
        JFrame frame=new JFrame("Student Details Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new BorderLayout());
        JPanel input=new JPanel(new GridLayout(4,2,10,10));
        JLabel nameLabel=new JLabel("Name:- ");
        JTextField nameField=new JTextField();
        JLabel rollnoLabel=new JLabel("Roll No:- ");
        JTextField rollnoField=new JTextField();
        JLabel gradeLabel=new JLabel("Grade:- ");
        JTextField gradeField=new JTextField();
        input.add(nameLabel);
        input.add(nameField);
        input.add(rollnoLabel);
        input.add(rollnoField);
        input.add(gradeLabel);
        input.add(gradeField);
        frame.add(input,BorderLayout.NORTH);
        JTextArea displayArea =new JTextArea(5,30);
        displayArea.setEditable(false);
        JScrollPane scrollPane=new JScrollPane(displayArea);
        frame.add(scrollPane,BorderLayout.CENTER);
        JButton displayButton=new JButton("Display Details");
        frame.add(displayButton,BorderLayout.SOUTH);
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    StudentBean student=new StudentBean();
                    student.setName(nameField.getText());
                    student.setRollno(Integer.parseInt(rollnoField.getText()));
                    student.setGrade(gradeField.getText());
                    displayArea.setText("Student Details:- ");
                    displayArea.append("Name:- "+student.getName()+"\n");
                    displayArea.append("Roll No:- "+student.getRollno()+"\n");
                    displayArea.append("Grade:- "+student.getGrade()+"\n");
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,"Invaild Rollno.Please enter a number.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}