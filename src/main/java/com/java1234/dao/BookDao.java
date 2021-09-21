package com.java1234.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java1234.entity.BookEntity;

public interface BookDao extends JpaRepository<BookEntity,Integer>{

}
