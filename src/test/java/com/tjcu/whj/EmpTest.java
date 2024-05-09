package com.tjcu.whj;

import com.tjcu.whj.entity.Emp;
import com.tjcu.whj.service.EmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class EmpTest {
    /**
     * 添加员工
     */
    @Test
    public void insert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        Emp emp = new Emp(null,"邓正武",2000d,22);
        empService.insert(emp);
    }


    /**
     * 删除员工
     */
    @Test
    public void deleteById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        empService.deleteById(4);
    }


    /**
     * 展示员工
     * @return
     */
    @Test
    public void showEmp(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        List<Emp> emps = empService.showEmp();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    /**
     * 修改员工
     */
    @Test
    public void updateEmp(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        Emp emp = new Emp(3,"邓正武",38000d,23);
        empService.updateEmp(emp);
    }
    /**
     * 数据回显
     * @return
     */
    @Test
    public void selectEmpById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        Emp emp = empService.selectEmpById(1);
        System.out.println(emp);
    }
}
