package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        Exam e1 = new Exam("Math");
        Exam e2 = new Exam("physics");
        Exam e3 = new Exam("Rus");

        Entrant ent1 = new Entrant("Alex1");
        Entrant ent2 = new Entrant("Alex2");
        Entrant ent3 = new Entrant("Alex3");

        Teacher teacher = new Teacher("John", e1);
        Department dep = new Department("KSIS");

        try {
            departmentEntrant(dep, ent1);
            departmentEntrant(dep, ent1);
            departmentEntrant(dep, ent2);
        } catch (Exception ex) {
            System.out.println(ex);
        }


        dep.EntrantsToString();

        LinkedList<Entrant> listEntrant = new LinkedList<Entrant>();
        // listEntrant.push(ent1);
        //listEntrant.push(ent2);
        listEntrant.push(ent3);
        try {
            e1.haveExam(listEntrant, teacher);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        e1.getResultExams();

    }

    public static void departmentEntrant(Department department, Entrant entrant) throws Exception {
        if (entrant.getDepartmentName() != null) {
            throw new Exception("Entrant " + entrant.getName() + " made his choice");
        }
        department.getEntrants().push(entrant);
        entrant.setDepartment(department);
    }

}
