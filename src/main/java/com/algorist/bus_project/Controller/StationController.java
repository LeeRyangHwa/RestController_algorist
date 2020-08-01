package com.algorist.bus_project.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StationController {
    //logger
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(path = "/station", produces = "application/json; charset=UTF-8")
    public List<Map<String, Object>> test1Controller(HttpServletRequest request){

        List<Map<String, Object>> mapList = new ArrayList<>();

        String x = request.getParameter("x_location");
        String y = request.getParameter("y_location");

        //값 로그 확인
        logger.info("######  x:"+x+"  y:"+y);

        return mapList;
    }
}
