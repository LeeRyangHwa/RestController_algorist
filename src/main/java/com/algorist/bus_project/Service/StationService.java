package com.algorist.bus_project.Service;

import com.algorist.bus_project.Mapper.StationMapper;
import com.algorist.bus_project.Vo.Station_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StationService {
    @Autowired
    StationMapper stationMapper;

    public List<Station_data> Surrounding(String x, String y){
        double location_x = Double.parseDouble(x);
        double location_y = Double.parseDouble(y);

        List<Station_data> stationList = stationMapper.findAll();

        stationList = stationList.stream()
                .filter(s->s.getX_location()>location_x&&s.getX_location()-location_x<0.001 ||s.getX_location()<location_x&&location_x-s.getX_location()<0.001)
                .filter(s->s.getY_location()>location_y&&s.getY_location()-location_y<0.001 ||s.getY_location()<location_y&&location_y-s.getY_location()<0.001)
                .collect(Collectors.toList());

        for(Station_data station:stationList){
            System.out.println(station.getStation_name());
        }

        System.out.println(stationList.size());

        return stationList;
    }
}
