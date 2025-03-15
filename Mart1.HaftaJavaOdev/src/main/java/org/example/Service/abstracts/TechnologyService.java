package org.example.Service.abstracts;

import org.example.Entity.Technology;


import java.util.*;

public interface TechnologyService {
    List<Technology> getTechnologies();
    void add(Technology technology);
    void delete(int id);
    void update(Technology technology);
    Technology getById(int id);
}
