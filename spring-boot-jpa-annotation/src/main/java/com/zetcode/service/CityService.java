package com.zetcode.service;

import com.zetcode.model.City;
import com.zetcode.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findByNameEndWith(String name) {
        List<City> cities = repository.findByNameEndsWith(name);
        return cities;
    }
}
