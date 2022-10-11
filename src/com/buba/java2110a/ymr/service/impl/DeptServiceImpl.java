package com.buba.java2110a.ymr.service.impl;

import com.buba.java2110a.ymr.dao.DeptDao;
import com.buba.java2110a.ymr.dao.impl.DeptDaoImpl;
import com.buba.java2110a.ymr.entity.Dept;
import com.buba.java2110a.ymr.service.DeptService;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao = new DeptDaoImpl();

    @Override
    public int addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public int delDept(Integer deptId) {
        return deptDao.delDept(deptId);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptDao.updateDept(dept);
    }

    @Override
    public Dept findDeptById(Integer id) {
        return deptDao.findDeptById(id);
    }

    @Override
    public List<Dept> findAllDept() {
        return deptDao.findAllDept();
    }
}
