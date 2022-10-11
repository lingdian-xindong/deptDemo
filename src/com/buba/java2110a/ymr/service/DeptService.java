package com.buba.java2110a.ymr.service;

import com.buba.java2110a.ymr.entity.Dept;

import java.util.List;

public interface DeptService {
    int addDept(Dept dept);

    int delDept(Integer deptId);

    int updateDept(Dept dept);

    Dept findDeptById(Integer id);

    List<Dept> findAllDept();
}
