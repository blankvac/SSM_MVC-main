package com.tjcu.whj;

import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerOutput;
import com.tjcu.whj.entity.Admin;
import com.tjcu.whj.service.AdminService;
import com.tjcu.whj.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AdminTest {
   

    @Test
    public void login(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminService = (AdminService) context.getBean("adminService");
        Admin admin = new Admin(null,null, "王恒杰", "123456",true);

        Admin login = adminService.login(admin);
        System.out.println(login);
    }

    @Test
    public void register(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminService = (AdminService) context.getBean("adminService");
        Admin admin = new Admin(null, "风犬少年","邓正武", "234567",true);
        adminService.register(admin);
    }
}
