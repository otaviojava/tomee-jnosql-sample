package org.soujava;

import jakarta.nosql.mapping.Repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface AnimalRepository extends Repository<Animal, String> {
    List<Animal> findAll();
}