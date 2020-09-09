package com.algorist.bus_Project.Controller;

import com.algorist.User.Controller.UserController;
import com.algorist.bus_Project.Service.StationService;
import com.algorist.bus_Project.Vo.Station_data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
public class StationController {
    @Autowired
    StationService stationService;

    //logger
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(path = "/station", produces = "application/json; charset=UTF-8")
    public Map<String, List<Object>> stationController(HttpServletRequest request){

        Map<String, List<Object>> map = new HashMap<>();

        String x = request.getParameter("x_location");   //x="126.985886";
        String y = request.getParameter("y_location");   //y="37.560813";

        //값 로그 확인
        logger.info("######  x:"+x+"  y:"+y);
        try{
            if(x!=null||y!=null) {
                List<Station_data> station = stationService.Surrounding(x, y);
                map.put("station", Collections.singletonList(station));
            }else{
                map.put("위도경도오류", null);
            }
        }catch (Exception e){
            map = null;
        }

        return map;
    }
}
