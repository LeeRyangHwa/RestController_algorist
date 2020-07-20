package com.algorist.bus_project.Service;

import com.algorist.bus_project.Mapper.UserMapper;
import com.algorist.bus_project.Vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserMapper userMapper;

    public User login_check(String userid, String password){
        User user = userMapper.findByuserid(userid);

        if(user!=null){
            if(user.getPassword().equals(password)){
                return user;
            }
        }

        return null;
    }
}
