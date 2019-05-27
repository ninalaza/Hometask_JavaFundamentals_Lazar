package by.htp.oop.task3;

import java.util.List;

public class GroupLogic {

    private Logic logic;


    public void printALevelStudents(Group group) {
        List<Student> students;

        students = group.getStudents();

        for (Student student : students) {

            if (logic.isALevelStudent(student)) {
                System.out.println(student);
            }
        }
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }
}
