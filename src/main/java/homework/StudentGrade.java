package homework;

public class StudentGrade {
    String name;
    Integer[] grades;

    public void enterGrade(int classNumber, int grade) {
        grades[classNumber - 1] = grade;
    }

    public Integer getGrade(int classNumber) {
        return grades[classNumber - 1];
    }
}
