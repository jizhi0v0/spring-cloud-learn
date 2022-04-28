package com.jay.springcloud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jay.springcloud.dao.DeptMapper;
import com.jay.springcloud.entities.Dept;
import com.jay.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Resource
	DeptMapper deptMapper;

	@Override
	public List<Dept> list() {
		return deptMapper.findAll();
	}

	@Override
	public boolean add(Dept record) {
		return deptMapper.addDept(record);
	}

	@Override
	public Dept get(Long deptno) {
		return deptMapper.selectByPrimaryKey(deptno);
	}

}
