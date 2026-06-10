package com.academy.zug_zug.Homework.ep27.DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDatabase {
    private final Map<Student, Map<Subject, Integer>> studentSubjects;
    private final Map<Subject, List<Student>> subjectStudents;

    public StudentDatabase() {
        studentSubjects = new HashMap<>();
        subjectStudents = new HashMap<>();
    }

    //Метод добавления студентов и их оценок в обе мапы
    public void putStudentSubject(String name, Map<String, Integer> map) {
        Student st = new Student(name);
        Map<Subject, Integer> newMapStudent = new HashMap<>();
        // Было принято стратегическое решение передавать имя ученика для создания объекта студент и
        // мапу, ключ - предмет, значение оценка. Проходим в цикле форич по мапе оценок и проставляем оценки в мапу по студенту конкретному
        // затем смотрим если в мапе предметов данный предмет уже существует, то значит в список просто кидаем студента, иначе создаем список
        // инициализируем и добавляем нашего созданного студента
        // P.S. Писал фулл сам, но в конце спросил у чата все ли гуд - он сказал не супер умно, но пойдет(
        for (Map.Entry<String, Integer> someEntry : map.entrySet()) {
            Subject subject = new Subject(someEntry.getKey());
            int mark = someEntry.getValue();
            newMapStudent.put(subject, mark);
            if (subjectStudents.containsKey(subject)) {
                List<Student> students = subjectStudents.get(subject);
                students.add(st);
            } else {
                List<Student> students = new ArrayList<>();
                students.add(st);
                subjectStudents.put(subject, students);
            }
        }
        studentSubjects.put(st, newMapStudent);
    }

    //Добавление нового предмета существующему студенту с оценкой
    public void addNewSubject(String studentName, String subjectName, int subjectMark) {
        Student student = new Student(studentName);
        Subject subject = new Subject(subjectName);
        try {
            if (studentSubjects.containsKey(student)) {
                studentSubjects.get(student).put(subject, subjectMark);
            } else {
                throw new IllegalArgumentException("Ошибка ввода, такого студента не существует");
            }
        } catch (IllegalArgumentException skip) {
            System.out.println(skip);
        }
    }

    //Удаление студента и всех его предметов
    public void studentDelete(String studentName) {
        Student student = new Student(studentName);
        Map<Subject, Integer> map = studentSubjects.get(student);
        if (map != null) {
            for (Map.Entry<Subject, Integer> bufMap : map.entrySet()) {
                Subject subject = bufMap.getKey();
                if (subjectStudents.containsKey(subject)) {
                    List<Student> studentList = subjectStudents.get(subject);
                    studentList.remove(student);
                }
            }
        }
        studentSubjects.remove(student);

    }

    //Вывод всех студентов и их оценок по предметам
    public void printAllStudentsAndSubjects() {
        Map<Subject, Integer> mapMap;
        for (Map.Entry<Student, Map<Subject, Integer>> bufMap : studentSubjects.entrySet()) {
            System.out.println("Студент: " + bufMap.getKey().toString());
            mapMap = bufMap.getValue();
            for (Map.Entry<Subject, Integer> bufMapSubject : mapMap.entrySet()) {
                System.out.println(bufMapSubject.getKey() + " оценка по предмету:" + bufMapSubject.getValue());
            }
        }
    }

    //Скипнул 2 прошлых метода из-за странного ТЗ. Удаление студента по конкретному предмету
    public void studentSubjectDelete(String studentName, String subjectName) {
        Subject subject = new Subject(subjectName);
        Student student = new Student(studentName);
        Map<Subject, Integer> bufMap;

        bufMap = studentSubjects.get(student);
        bufMap.remove(subject);
        subjectStudents.get(subject).remove(student);
    }

    public void printAllSubjectsAndStudent() {
        for (Map.Entry<Subject, List<Student>> map : subjectStudents.entrySet()) {
            System.out.println("Предмет: " + map.getKey());
            System.out.println("Студенты по предмету: " + map.getValue());
        }
    }
}
