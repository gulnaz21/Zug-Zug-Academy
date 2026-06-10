package com.academy.zug_zug.Homework.ep27;

import com.academy.zug_zug.Homework.ep27.DB.StudentDatabase;

import java.util.HashMap;
import java.util.Map;

public class StudentBaseTestFor {
    private static final String subjectMath = "Math";
    private static final String subjectPhysics = "Physics";
    private static final String subjectLaw = "Law";
    private static final String firstStudent = "Andrey";
    private static final String secondStudent = "Vagizik";

    public static void main(String[] args) {
        StudentDatabase studentDatabase = new StudentDatabase();
        Map<String, Integer> subjectIntegerMap = new HashMap<>();
        subjectIntegerMap.put(subjectMath, 5);
        subjectIntegerMap.put(subjectPhysics, 4);
        subjectIntegerMap.put(subjectLaw, 5);
        studentDatabase.putStudentSubject(firstStudent, subjectIntegerMap);
        studentDatabase.putStudentSubject(secondStudent, subjectIntegerMap);
        studentDatabase.studentSubjectDelete(secondStudent, subjectMath);
        studentDatabase.printAllStudentsAndSubjects();
        studentDatabase.printAllSubjectsAndStudent();
    }
}
