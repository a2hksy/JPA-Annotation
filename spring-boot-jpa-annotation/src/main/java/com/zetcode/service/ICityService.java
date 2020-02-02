package com.zetcode.service;

import com.zetcode.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICityService {
    List<City>findByNameEndWith(String name);
}
