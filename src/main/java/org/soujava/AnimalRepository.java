package org.soujava;

import jakarta.nosql.mapping.Repository;

import java.util.List;

public interface AnimalRepository extends Repository<Animal, String> {
    List<Animal> findAll();
}