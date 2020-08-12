package com.algorist.bus_project.Controller;

import com.algorist.bus_project.Service.LoginService;
import com.algorist.bus_project.Vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    //logger
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/login", produces = "application/json; charset=UTF-8")
    public Map<String, Object>loginController(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();

        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

        //값 로그 확인
        logger.info("######  id:"+id+"  pass:"+pass);

        User userinfo = loginService.login_check(id,pass);

        if(userinfo==null){
            map.put("user","false");
        }else{
            map.put("user",userinfo);
        }

        return map;
    }
}
