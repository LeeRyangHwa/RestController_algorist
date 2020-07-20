package com.algorist.bus_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {


    @RequestMapping(path = "/test2", produces = "application/json; charset=UTF-8")
    public String test2Controller(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "spring Received value: "+name;
    }
}
