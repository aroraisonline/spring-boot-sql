package com.sgsql.controller;

import com.sgsql.model.City;
import com.sgsql.service.CityService;
import com.sgsql.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @Autowired
  private ICityService cityService;

  @GetMapping("/showCities")
  public String findCities(Model model) {

    var cities = (List<City>) cityService.findAll();

    model.addAttribute("cities", cities);

    return "showCities";
  }

}
