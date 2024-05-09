package com.tjcu.whj.service.impl;

import com.tjcu.whj.dao.AdminDao;
import com.tjcu.whj.dao.EmpDao;
import com.tjcu.whj.entity.Admin;
import com.tjcu.whj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
  private AdminDao adminDao;

    @Override
    public Admin login(Admin admin) {

        return adminDao.login(admin);
    }

    @Override
    public void register(Admin admin) {
         adminDao.register(admin);
    }
}
