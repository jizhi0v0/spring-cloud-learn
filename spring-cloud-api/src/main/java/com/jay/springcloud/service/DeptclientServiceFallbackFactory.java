package com.jay.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jay.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptclientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			
			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id).setDname("该id" + id + "没有对应信息").setDb_source("no this database in mysql");
			}
			
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
