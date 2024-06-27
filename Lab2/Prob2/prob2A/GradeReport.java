package Lab2.Prob2.prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    public GradeReport(String grade, Student student) {
        this.grade = grade;
        this.student = student;
    }

    public String getGrade() {return grade;}
    public Student getStudent() {return student;}

}
