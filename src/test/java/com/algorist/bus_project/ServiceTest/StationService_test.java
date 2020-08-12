package com.algorist.bus_project.ServiceTest;

import com.algorist.bus_project.Service.doubleCheck;
import com.algorist.bus_project.Vo.Station_data;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class StationService_test {

    List<Station_data> data  = new ArrayList<>();

    @Before
    public void setUp(){
        final Station_data station_data1 = Station_data.builder()
                .line_id("100100008")
                .line_name("103")
                .number("33")
                .intersection("100700344")
                .bus_station("101000290")
                .ars_id("02286")
                .station_name("시청앞.덕수궁")
                .x_location(126.9770031031)
                .y_location(37.5662159552)
                .build();
        final Station_data station_data2= Station_data.builder()
                .line_id("100100029")
                .line_name("150")
                .number("33")
                .intersection("100700344")
                .bus_station("101000290")
                .ars_id("02286")
                .station_name("시청앞.덕수궁")
                .x_location(126.9770031031)
                .y_location(37.5662159552)
                .build();

        data.add(station_data1);
        data.add(station_data2);
    }

    @Test
    public void station_name() {
        doubleCheck<String, String> doubleCheck = new doubleCheck<>();
        HashSet<String> set = new HashSet<>();

        set.add("101000290");
        boolean x = doubleCheck.setCheck(set,"101000290");

        Assert.assertTrue(x);

    }
}