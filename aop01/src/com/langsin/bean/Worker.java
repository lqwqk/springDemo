package com.langsin.bean;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:04:50
 */
public class Worker {
    private String wid;
    private String wname;
    private Integer age;
    private String sex;

    public Worker() {
        // TODO Auto-generated constructor stub
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Worker(String wid, String wname, Integer age, String sex) {
        super();
        this.wid = wid;
        this.wname = wname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Worker [wid=" + wid + ", wname=" + wname + ", age=" + age + ", sex=" + sex + "]";
    }

}
