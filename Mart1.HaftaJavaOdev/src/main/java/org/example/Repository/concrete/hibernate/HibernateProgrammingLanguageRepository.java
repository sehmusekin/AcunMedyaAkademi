package org.example.Repository.concrete.hibernate;

import org.example.Entity.ProgrammingLanguage;
import org.example.Repository.abstracts.ProgrammingLanguageRepository;

import java.util.*;


public class HibernateProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    public List<ProgrammingLanguage> programmingLanguages ;


    public HibernateProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<>();

        programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Hibernate"));
        programmingLanguages.add(new ProgrammingLanguage(3,"PHP"));
        programmingLanguages.add(new ProgrammingLanguage(4,"C++"));







    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        System.out.println("Programming language added");
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll(){
        System.out.println("Programming language list");
        return programmingLanguages;
    }

    @Override
    public void delete(int id) {
        System.out.println("Programming language deleted");
        programmingLanguages.remove(id);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        System.out.println("Programming language updated");
        programmingLanguages.set(programmingLanguage.getId(),programmingLanguage);

    }

    @Override
    public ProgrammingLanguage getById(int id) {

        return null;
    }
}
