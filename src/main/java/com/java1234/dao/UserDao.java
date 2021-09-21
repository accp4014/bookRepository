package com.java1234.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java1234.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity,Integer>{

	@Query(value="select * from `user` where userName = :userName and password = :password",nativeQuery=true)
	UserEntity getUserInfo(@Param("userName")String userName,@Param("password")String password);
}
