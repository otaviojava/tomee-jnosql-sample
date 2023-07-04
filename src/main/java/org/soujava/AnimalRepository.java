package org.soujava;

import jakarta.data.repository.PageableRepository;
import jakarta.data.repository.Repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@Repository
public interface AnimalRepository extends PageableRepository<Animal, String> {
}