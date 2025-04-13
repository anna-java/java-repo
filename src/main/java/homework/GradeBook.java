package homework;

public class GradeBook {
    StudentGrade[] studentGrades; //book rows


    public void enterGrade(String studentName, int classNumber, int grade) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if (studentGrade == null) {
            System.out.println("Can't find student with the name " + studentName);
            return;
        }
        studentGrade.enterGrade(classNumber, grade);
    }


    StudentGrade findStudentByName(String studentName) {
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.name.equals(studentName)) {
                return studentGrade;
            }
        }
        return null;
    }


    public void printGradesForClass(int classNumber) {
        for (StudentGrade studentGrade : studentGrades) {
            Integer grade = studentGrade.getGrade(classNumber);
            if (grade != null) {
                System.out.println(studentGrade.name + ": " + grade);
            }
        }
    }


    public void printAllGrades() {
        for (StudentGrade studentGrade : studentGrades) {
            System.out.println(studentGrade.name + ": ");
            for (Integer grade : studentGrade.grades) {
                if (grade == null) {
                    System.out.print(" ");
                } else {
                    System.out.println(" " + grade);
                }
            }
            System.out.println();
        }
    }


    public double avgGrade(String studentName) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if (studentGrade == null) {
            System.out.println("Can't find student with the name " + studentName);
            return -1;
    }
    int numberOfGrades = 0;
    double gradeSum = 0;
    for (Integer grade : studentGrade.grades) {
        if (grade != null) {
            numberOfGrades++;
            gradeSum += grade;

        }
    }
    return gradeSum / numberOfGrades;
    }
}