package com.algorist.bus_Project.Mapper;

import com.algorist.bus_Project.Vo.Station_data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface StationMapper {
    @Select("SELECT * FROM station_data")
    List<Station_data> findAll();
}
