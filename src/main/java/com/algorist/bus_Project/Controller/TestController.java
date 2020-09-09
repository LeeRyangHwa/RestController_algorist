package com.algorist.bus_Project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @RequestMapping(path = "/test1", produces = "application/json; charset=UTF-8")
    public String test1Controller() {

        return "test";
    }
    @RequestMapping(path = "/test2", produces = "application/json; charset=UTF-8")
    public String test2Controller(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "spring Received value: "+name;
    }
}
