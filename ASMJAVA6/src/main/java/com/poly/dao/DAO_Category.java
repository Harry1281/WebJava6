package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.entity.Category;

@Repository
public interface DAO_Category extends JpaRepository<Category, String>{

}
