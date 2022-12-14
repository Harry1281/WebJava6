package com.poly.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.DAO_Role;
import com.poly.entity.Role;
import com.poly.service.Service_Role;

@Service
public class ServiceImpl_Role implements Service_Role{

	@Autowired private DAO_Role dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}
	
}
