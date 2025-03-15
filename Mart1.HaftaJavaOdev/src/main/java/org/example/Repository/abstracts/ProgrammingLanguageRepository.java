package org.example.Repository.abstracts;

import org.example.Entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();


    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
}
