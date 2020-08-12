package com.algorist.bus_project.Vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Station_data {
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
