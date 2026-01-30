public class Student {
    private String studentName;
    private double gpa;

    public Student(String name, double gpa){
        this.studentName = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getStudentName() {
        return studentName;
    }
}
