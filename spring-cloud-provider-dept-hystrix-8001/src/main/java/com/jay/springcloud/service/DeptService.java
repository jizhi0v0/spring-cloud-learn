package com.jay.springcloud.service;

import java.util.List;

import com.jay.springcloud.entities.Dept;

public interface DeptService {

	List<Dept> list();

	boolean add(Dept record);

    Dept get(Long deptno);

}
