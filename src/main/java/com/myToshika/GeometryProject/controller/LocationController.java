package com.myToshika.GeometryProject.controller;


import com.myToshika.GeometryProject.entity.LocationEntity;
import com.myToshika.GeometryProject.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locationEntity")
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/add")
    public String addLocationEntity(@RequestParam double latitude, @RequestParam double longitude) {
        return locationService.addLocationEntity(latitude, longitude);
    }

    @GetMapping("/getALl")
    public List<String> getAllLocationEntities() {
        return locationService.getAllLocationEntities();
    }
}
