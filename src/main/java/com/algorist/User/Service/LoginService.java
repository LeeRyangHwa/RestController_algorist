package com.algorist.User.Service;

import com.algorist.User.Mapper.userRepository;
import com.algorist.User.Vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    userRepository userRepository;

    public User login_check(String userId, String password){
        User user = userRepository.findByUser_id(userId,password);

        return user;
    }
}