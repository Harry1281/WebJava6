package com.poly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poly.entity.Role;


@Service
public interface Service_Role {
	List<Role> findAll();
}
