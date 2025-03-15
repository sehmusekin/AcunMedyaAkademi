package org.example.Service.concrete;

import org.example.Entity.ProgrammingLanguage;
import org.example.Repository.abstracts.ProgrammingLanguageRepository;
import org.example.Service.abstracts.ProgrammingLanguageService;

import java.util.*;

public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository repository;

    public ProgrammingLanguageServiceImpl(ProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return repository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage.getName() == null || programmingLanguage.getName().trim().isEmpty()) {
            throw new RuntimeException("Programming language name cannot be empty!");
        }
        repository.add(programmingLanguage);
    }


    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        repository.update(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }





}
