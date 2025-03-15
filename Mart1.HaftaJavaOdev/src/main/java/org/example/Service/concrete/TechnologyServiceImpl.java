package org.example.Service.concrete;

import org.example.Entity.Technology;
import org.example.Repository.abstracts.TechnologyRepository;
import org.example.Service.abstracts.TechnologyService;

import java.util.*;

public class TechnologyServiceImpl  implements TechnologyService {

    private TechnologyRepository repository;

    public TechnologyServiceImpl(TechnologyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Technology> getTechnologies() {
        return repository.getAll();
    }

    @Override
    public void add(Technology technology) {
        if (technology.getId()<0)
            throw new RuntimeException("Technolgy id is negative");
        repository.add(technology);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public void update(Technology technology) {
        repository.update(technology);
    }
    @Override
    public Technology getById(int id) {
        return repository.getById(id);
    }
}


