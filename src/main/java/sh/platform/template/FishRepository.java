package sh.platform.template;

import jakarta.nosql.mapping.Repository;

import java.util.List;

public interface FishRepository extends Repository<Fish, String> {
    List<Fish> findAll();
}