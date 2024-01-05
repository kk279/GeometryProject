package com.myToshika.GeometryProject.repository;

import com.myToshika.GeometryProject.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {
}
