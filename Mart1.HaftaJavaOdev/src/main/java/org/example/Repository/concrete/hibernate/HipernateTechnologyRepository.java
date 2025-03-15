package org.example.Repository.concrete.hibernate;

import org.example.Entity.ProgrammingLanguage;
import org.example.Entity.Technology;
import org.example.Repository.abstracts.TechnologyRepository;


import java.util.*;

public class HipernateTechnologyRepository implements TechnologyRepository {
    public List<Technology> technologies;

    public HipernateTechnologyRepository() {
        technologies = new ArrayList<>();

        technologies.add(new Technology(1, "Spring Bot", new   ProgrammingLanguage(1,"Java")));
    }





    @Override
    public void add(Technology technology) {
        System.out.println("Technology added");
        technologies.add(technology);

    }

    @Override
    public List<Technology> getAll() {

       System.out.println("Technology list");
       return technologies;
    }

    @Override
    public void delete(int id) {
        System.out.println("Technology deleted");
        technologies.remove(id);

    }

    @Override
    public void update(Technology technology) {
        System.out.println("Technology updated");
        technologies.set(technology.getId(), technology);

    }

    @Override
    public Technology getById(int id) {
        return null;
    }
}
