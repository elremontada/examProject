package com.company;

import java.util.LinkedList;


public class Department {
    private String name;

    private LinkedList<Entrant> entrants = new LinkedList<Entrant>();



    public Department(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public LinkedList<Entrant>   getEntrants(){
        return  entrants;
    }

    public void EntrantsToString(){
        for (Entrant entrant: entrants) {
            System.out.println(entrant.getName());
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "entrants=" + entrants +
                ", name='" + name + '\'' +
                '}';
    }
}
