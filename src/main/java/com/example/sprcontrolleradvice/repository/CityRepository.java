package com.example.sprcontrolleradvice.repository;

import com.example.sprcontrolleradvice.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class CityRepository {
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CityRepository extends CrudRepository<City, Long> {

    }
}
