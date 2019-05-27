package by.htp.oop.task3;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    //Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
    // успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
    // Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

    private String firstName;
    private String lastName;
    private int groupNumber;
    private int[] marks = new int[5];

    public Student(String firstName, String lastName, int groupNumber, int[] marks) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public Student() {
    }

    public Student(String firstName, int groupNumber) {

        this.firstName = firstName;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(firstName, lastName, groupNumber);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
