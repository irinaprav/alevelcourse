package com.company.module.oop2;

import java.util.ArrayList;
import java.util.Map;

public class StudentsList {
    private ArrayList<Student> students;
    private int strudentsAmount;
    private static final int SCHOLARSHIP = 2000;
    private static double well = 0.25;
    private static double perfectAndWell = 0.5;
    private static double perfect = 1;

    public StudentsList(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentsList() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(String fio, Integer... values) {
        for (Student st : students) {
            if (fio.equals(st.getFio())) throw new IllegalArgumentException("Already Exsists!");
        }
        if ((values.length > Student.MAXIMUM) || (values.length < Student.MINIMUM))
            throw new IllegalArgumentException("Illegal amount!");
        Student student = new Student(fio);
        for (Integer v : values) {
            student.getAchievements().add(v);

        }
        students.add(student);
    }

    public void countScholarship() {
        for (Student st : students) {
            boolean findGood = false;
            boolean findTerrible = false;
            boolean findSatisfactorily = false;
            boolean findExcellent = false;
            for (Integer i : st.getAchievements()) {
                if (i.equals(4)) findGood = true;
                if ((i.equals(2)) || (i.equals(1))) findTerrible = true;
                if (i.equals(3)) findSatisfactorily = true;
                if (i.equals(5)) findExcellent = true;
            }
            if ((findSatisfactorily) || (findTerrible)) {
                st.setScholarship(0);
                continue;
            }
            if ((findGood) && (findExcellent)) {
                st.setScholarship(SCHOLARSHIP * perfectAndWell);
                continue;
            }
            if (findGood) {
                st.setScholarship(SCHOLARSHIP * well);
                continue;
            }
            if (findExcellent) {
                st.setScholarship(SCHOLARSHIP * perfect);
                continue;
            }
        }

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Student st : students) {
            builder.append(st.toString());
        }
        return builder.toString();
    }

}
