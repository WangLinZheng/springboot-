package com.wlz.cont.user.pojo;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "用户实体类")
public class User {


    private Integer id;
    private String account;
    private String pwd;
    private String creattime;
    private Integer status;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", creattime='" + creattime + '\'' +
                ", status=" + status +
                '}';
    }

    public User(Integer id, String account, String pwd, String creattime, Integer status) {
        this.id = id;
        this.account = account;
        this.pwd = pwd;
        this.creattime = creattime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
