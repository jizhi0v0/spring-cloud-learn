package com.jay.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jay.springcloud.entities.Dept;
import com.jay.springcloud.service.DeptClientService;

@RestController
public class DeptConsumerController {
	
	@Resource
	private DeptClientService deptClientService;
	
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return deptClientService.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return deptClientService.list();
	}
	
}
