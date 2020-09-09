package com.algorist.User.Mapper;

import com.algorist.User.Vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface UserMapper {
    @Select("SELECT * FROM user WHERE userid = #{id}")
    User findByuserid(@Param("id")String id);

    @Select("SELECT * FROM user")
    List<User> findAll();
}
