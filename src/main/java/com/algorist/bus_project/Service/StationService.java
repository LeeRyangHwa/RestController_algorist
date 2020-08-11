package com.algorist.bus_project.Service;

import com.algorist.bus_project.Mapper.StationMapper;
import com.algorist.bus_project.Vo.Station_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    @Autowired
    StationMapper stationMapper;

    public List<Station_data> Surrounding(){
        List<Station_data> stationList = stationMapper.findAll();

        for(Station_data station:stationList){
            System.out.println(station.getStation_name());
        }
        return null;
    }
}
