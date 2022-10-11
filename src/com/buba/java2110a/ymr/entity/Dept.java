package com.buba.java2110a.ymr.entity;

public class Dept {
    private Integer deptId;
    private String deptNumber;
    private String deptName;
    private String province;
    private Integer people;
    private String depict;

    public Dept() {
    }

    public Dept(String deptNumber, String deptName, String province, Integer people, String depict) {
        this.deptNumber = deptNumber;
        this.deptName = deptName;
        this.province = province;
        this.people = people;
        this.depict = depict;
    }

    public Dept(Integer deptId, String deptNumber, String deptName, String province, Integer people, String depict) {
        this.deptId = deptId;
        this.deptNumber = deptNumber;
        this.deptName = deptName;
        this.province = province;
        this.people = people;
        this.depict = depict;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptNumber='" + deptNumber + '\'' +
                ", deptName='" + deptName + '\'' +
                ", province='" + province + '\'' +
                ", people=" + people +
                ", depict='" + depict + '\'' +
                '}';
    }
}
