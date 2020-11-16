package com.algorist.User.Mapper;

import com.algorist.User.Vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository  extends JpaRepository<User, Integer> {
    @Query("select a from User a where a.user_id = :user_id and a.password = :password")
    User findByUser_id(@Param("user_id") String user_id, @Param("password") String password);
}
