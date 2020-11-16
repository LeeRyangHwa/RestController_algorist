package com.algorist.bus_Project.Vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Station_data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    private String line_id;
    private String line_name;
    private String number;
    private String intersection;
    private String bus_station;
    private String ars_id;
    private String station_name;
    private double x_location;
    private double y_location;


}
