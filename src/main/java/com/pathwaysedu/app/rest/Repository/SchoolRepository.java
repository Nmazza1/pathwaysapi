package com.pathwaysedu.app.rest.Repository;

import com.pathwaysedu.app.rest.Entity.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {
    List<School> findAllByRegion(String region);
}