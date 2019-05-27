package by.htp.oop.task3;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> students;

    public Group(){
        students = new ArrayList<Student>();

    }

    public List<Student> getStudents() {
        return students;
    }
}
