package com.algorist.User.Controller;

import com.algorist.User.Service.LoginService;
import com.algorist.User.Vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    //logger
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    LoginService loginService;

//    @RequestMapping(path = "/login", produces = "application/json; charset=UTF-8")
    @PostMapping(path = "/login", produces = "application/json; charset=UTF-8")
//    @RequestMapping(path = "/login",method=Requ produces = "application/json; charset=UTF-8")
    public Map<String, Object> loginController(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();

        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

//        user.setUserid(id);
//        user.setPassword(pass);
//        map.put("user", user);
//
//        //값 로그 확인
        logger.info("######  id:" + id + "  pass:" + pass);
//
        User userinfo = loginService.login_check(id, pass);
//
        if (userinfo == null) {
            map.put("user", null);
        } else {
            map.put("user", userinfo);
        }
        logger.info("######  Check:" + map);

        return map;
    }
}