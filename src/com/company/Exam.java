package com.company;
import java.util.*;

public class Exam {
    private String name;
    private HashMap entrantMark = new HashMap();

    public Exam(String name) {
        this.name = name;
    }

    public void haveExam(LinkedList<Entrant> entrants, Teacher teacher) throws Exception {
        if (entrants.size() == 0) {
            throw new Exception("Zero entrants");
        }
        if(teacher.getExam() != this){
            throw new Exception("Teacher`s knowledge isn`t equivalent this Exam");
        }
        for (Entrant entrant : entrants) {
            entrantMark.put(entrant, teacher.grade(entrant));
        }
    }

    public void getResultExams() {
        Set set = entrantMark.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Студент: " + ((Entrant) (entry.getKey())).getName() + " : Оценка: " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                '}';
    }
}
