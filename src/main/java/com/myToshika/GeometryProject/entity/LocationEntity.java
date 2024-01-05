package com.myToshika.GeometryProject.entity;


import lombok.Data;
import lombok.ToString;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;


@Data
@ToString
@Entity
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "geometry")
    private Point location;
}
