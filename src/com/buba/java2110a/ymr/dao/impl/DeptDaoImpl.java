package com.buba.java2110a.ymr.dao.impl;

import com.buba.java2110a.ymr.dao.DeptDao;
import com.buba.java2110a.ymr.entity.Dept;
import com.buba.java2110a.ymr.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DeptDaoImpl implements DeptDao {
    @Override
    public int addDept(Dept dept) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "insert into dept(dept_number,dept_name,province,people,depict) values(?,?,?,?,?)";
        int add = jdbcTemplate.update(sql, dept.getDeptNumber(), dept.getDeptName(), dept.getProvince(), dept.getPeople(), dept.getDepict());
        return add;
    }

    @Override
    public int delDept(Integer deptId) {
        return 0;
    }

    @Override
    public int updateDept(Dept dept) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "update dept set dept_number=?,dept_name=?,province=?,people=?,depict=? where dept_id = ?";
        int update = jdbcTemplate.update(sql, dept.getDeptNumber(), dept.getDeptName(), dept.getProvince(), dept.getPeople(), dept.getDepict(), dept.getDeptId());
        return update;
    }

    @Override
    public Dept findDeptById(Integer id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "select * from dept where dept_id = ?";
        Dept dept = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Dept.class), id);
        return dept;
    }

    @Override
    public List<Dept> findAllDept() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "select * from dept";
        List<Dept> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dept.class));
        return query;
    }
}
