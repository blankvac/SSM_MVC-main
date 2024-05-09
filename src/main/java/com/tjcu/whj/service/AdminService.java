package com.tjcu.whj.service;

import com.tjcu.whj.entity.Admin;


public interface AdminService {
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
