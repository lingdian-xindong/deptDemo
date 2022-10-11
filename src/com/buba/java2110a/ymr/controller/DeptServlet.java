package com.buba.java2110a.ymr.controller;

import com.buba.java2110a.ymr.entity.Dept;
import com.buba.java2110a.ymr.service.DeptService;
import com.buba.java2110a.ymr.service.impl.DeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeptServlet extends ViewBaseServlet{
    private DeptService deptService = new DeptServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("method").equals("findAllDept")){
            this.findAllDept(req,resp);
        }

//        if(req.getParameter("method").equals("addJump")){
//            this.addJump(req,resp);
//        }
//
//        if(req.getParameter("method").equals("addDept")){
//            this.addDept(req,resp);
//        }

        if(req.getParameter("method").equals("updateDept")){
            this.updateDept(req,resp);
        }

        if(req.getParameter("method").equals("findDeptById")){
            this.findDeptById(req,resp);
        }
    }

    public void findAllDept(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Dept> allDept = deptService.findAllDept();
        req.setAttribute("deptList",allDept);
        processTemplate("list",req,resp);
    }

//    public void addDept(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String number = req.getParameter("number");
//        String name = req.getParameter("name");
//        String province = req.getParameter("province");
//        String people = req.getParameter("people");
//        String depict = req.getParameter("depict");
//        Dept dept = new Dept(number, name, province, Integer.valueOf(people), depict);
//        deptService.updateDept(dept);
//        this.findAllDept(req,resp);
//    }
//
//    public void addJump(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id = req.getParameter("id");
//        Dept deptById = deptService.findDeptById(Integer.valueOf(id));
//        req.setAttribute("dept",deptById);
//        processTemplate("update",req,resp);
//    }

    public void updateDept(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptNumber = req.getParameter("deptNumber");
        String deptName = req.getParameter("deptName");
        String province = req.getParameter("province");
        String people = req.getParameter("people");
        String depict = req.getParameter("depict");
        Dept dept = new Dept(deptNumber, deptName, province, Integer.valueOf(people), depict);
        deptService.updateDept(dept);
        this.findAllDept(req,resp);
    }

    public void findDeptById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String checkbox = req.getParameter("checkbox");
        Dept deptById = deptService.findDeptById(Integer.valueOf(checkbox));
        req.setAttribute("dept",deptById);
        processTemplate("update",req,resp);
    }
}
