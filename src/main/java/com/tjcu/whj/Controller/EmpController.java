package com.tjcu.whj.Controller;

import com.tjcu.whj.entity.Emp;
import com.tjcu.whj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller("emoController")
@RequestMapping("emp")
public class EmpController {
    /**
     * 注入empService在EmpController中
     */
    @Autowired
    private EmpService empService;

    /**
     * 添加员工
     *
     * @param emp
     */
    @RequestMapping("insert")
    public String insert(Emp emp){

        empService.insert(emp);
        return "redirect:/emp/show";
    }


    /**
     * 删除员工
     * @param emp
     */
    @RequestMapping("delete")
    public String  deleteById(Emp emp){
        empService.deleteById(emp.getId());
  return "redirect:/emp/show";
    }

    /**
     * 展示员工
     * @return
     */
    @RequestMapping("show")
    public String showEmp(Model model){
        //调用业务方法
        List<Emp> emps = empService.showEmp();
        //作用域
        model.addAttribute("emps",emps);
        return "emplist";
    }

    /**
     * 修改员工
     * @param emp
     */
    @RequestMapping("update")
    public String  updateEmp(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/emp/show";
    }


    /**
     * 数据回显
     * @param id
     * @return
     */
    @RequestMapping("select")
    public String selectEmpById(Integer id,Model model){
        Emp emp = empService.selectEmpById(id);
        model.addAttribute("emp",emp);
        return "updateEmp";
    }
}
