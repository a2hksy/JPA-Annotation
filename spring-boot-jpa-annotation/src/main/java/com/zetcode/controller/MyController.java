package com.zetcode.controller;

import com.zetcode.model.City;
import com.zetcode.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    ICityService cityService;

    @GetMapping("/showCitiesEnding")
    public String findCitiesNameEndsWith(Model model, @RequestParam String name){
        List<City> cities = cityService.findByNameEndWith(name);
        model.addAttribute("cities", cities);
        return "showCities";
    }
}
