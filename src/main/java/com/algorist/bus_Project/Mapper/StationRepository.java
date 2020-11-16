package com.algorist.bus_Project.Mapper;

import com.algorist.bus_Project.Vo.Station_data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StationRepository extends JpaRepository<Station_data, Integer> {

}
