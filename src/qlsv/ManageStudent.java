package qlsv;

import java.util.ArrayList;

public class ManageStudent {
    ArrayList<Student> students;

    public ManageStudent() {
        this.students = new ArrayList<>();

    }


    public void display() {
        for (int i = 0; i < students.size() ; i++) {
            System.out.println(students.get(i));
        }
    }
}
