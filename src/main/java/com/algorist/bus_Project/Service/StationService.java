package com.algorist.bus_Project.Service;

import com.algorist.bus_Project.Mapper.StationRepository;
import com.algorist.bus_Project.Vo.Station_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StationService { //주변역에 관한 정보 모두 제공
    @Autowired
    StationRepository stationRepository;
    @Autowired
    doubleCheck doubleCheck;

    public List<Station_data> Surrounding(String x, String y) {
        double location_x = Double.parseDouble(x);
        double location_y = Double.parseDouble(y);

        List<Station_data> stationList = stationRepository.findAll();

        stationList = stationList.stream()
                .filter(s -> s.getX_location() > location_x && s.getX_location() - location_x < 0.001 || s.getX_location() < location_x && location_x - s.getX_location() < 0.001)
                .filter(s -> s.getY_location() > location_y && s.getY_location() - location_y < 0.001 || s.getY_location() < location_y && location_y - s.getY_location() < 0.001)
                .collect(Collectors.toList());

        stationList = station_name(stationList);

        return stationList;
    }

    //중복되는 정류소id(bus_station) 제거
    public List<Station_data> station_name(List<Station_data> data){
        HashSet<String> set = new HashSet<>();
        List<Station_data> station_data = new ArrayList<>();

        for(Station_data s:data){
            if(!doubleCheck.setCheck(set,s.getBus_station())) {
                set.add(s.getBus_station());
                station_data.add(s);
            }
        }
        
        return station_data;
    }
}
