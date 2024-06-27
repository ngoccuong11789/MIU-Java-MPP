package Lab2.Prob2.prob2A;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Cuong", "A");
        GradeReport gradeReport = student.getGradeReport();
        System.out.println("Student's name is " + student.getName());
        System.out.println("Student's grade is " + gradeReport.getGrade());
    }
}
