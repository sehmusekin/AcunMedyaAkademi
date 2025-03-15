package org.example.Service.abstracts;

import org.example.Entity.ProgrammingLanguage;

import java.util.*;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getProgrammingLanguages();
    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);




}
