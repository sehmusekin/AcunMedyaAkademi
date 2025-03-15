package org.example.Repository.abstracts;
import org.example.Entity.Technology;

import java.util.List;

public interface TechnologyRepository {
    void add(Technology technology);
    List<Technology> getAll();
    void delete(int id);
    void update(Technology technology);
    Technology getById(int id);
}
