package com.tjcu.whj.entity;


public class Admin {
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 真实姓名
     */
    private String username;
    private String password;
    private Boolean sex;

    public Admin() {
    }

    public Admin(Integer id, String name, String username, String password, Boolean sex) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
