package by.htp.oop.task3;

public class Logic {

    public boolean isALevelStudent(Student student) {
        int[] marks = student.getMarks();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 9 || marks[i] != 10) {
                return false;
            }
        }
        return true;
    }

}


