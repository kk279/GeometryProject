package com.myToshika.GeometryProject.service;


import com.myToshika.GeometryProject.entity.LocationEntity;
import com.myToshika.GeometryProject.repository.LocationRepository;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;
    GeometryFactory geometryFactory = new GeometryFactory();

    public String addLocationEntity(double latitude, double longitude) {
        LocationEntity locationEntity = new LocationEntity();
        Point point = geometryFactory.createPoint(new Coordinate(latitude, longitude));
        locationEntity.setLocation(point);
        locationRepository.save(locationEntity);
        return locationRepository.findById(locationEntity.getId()).get().toString();
    }

    public List<String> getAllLocationEntities() {
        List<String> locations = locationRepository.findAll().stream().map(p-> p.toString()).collect(Collectors.toList());
        return locations;
    }
}
