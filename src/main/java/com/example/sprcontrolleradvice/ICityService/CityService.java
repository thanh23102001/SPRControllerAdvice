package com.example.sprcontrolleradvice.ICityService;


import com.example.sprcontrolleradvice.model.City;
import com.example.sprcontrolleradvice.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City findById(Long id) {

        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    @Override
    public City save(City city) {

        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {

        var cities = (List<City>) cityRepository.findAll();

        if (cities.isEmpty()) {

            throw new NoDataFoundException();
        }

        return cities;
    }
