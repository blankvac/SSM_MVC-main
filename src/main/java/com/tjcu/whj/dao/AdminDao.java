package com.tjcu.whj.dao;

import com.tjcu.whj.entity.Admin;


public interface AdminDao {
    /**
     * 登录
     * @param admin
     * @return
     */
    public Admin login(Admin admin);
    /**
     *  注册
     * @param admin
     */
    public void register(Admin admin);
}
