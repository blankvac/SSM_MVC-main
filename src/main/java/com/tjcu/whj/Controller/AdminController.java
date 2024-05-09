package com.tjcu.whj.Controller;

import com.tjcu.whj.entity.Admin;
import com.tjcu.whj.service.AdminService;
import com.tjcu.whj.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller("adminController")
@RequestMapping("admin")
public class AdminController {
    /**
     * 将adminService到AdminController中
     */
    @Autowired
    private AdminService adminService;

    /**
     * 登录
     * @param admin
     * @return
     */
//    @RequestMapping("login")
//    public String login(Admin admin,HttpServletRequest request){
//        String password = MD5Utils.md5(admin.getPassword());
//        admin.setPassword(password);
//        Admin admin1 = adminService.login(admin);
//        System.out.println(admin1);
//        if(admin1!=null){
//            request.getSession().setAttribute("admin",admin1);
//            return "redirect:/emp/show";
//        }
//       return "redirect:/login.jsp";
//    }
    @RequestMapping("login")
    public String login(Admin admin, HttpServletRequest request) {
        // 调用服务层方法验证登录
        Admin admin1 = adminService.login(admin);

        if (admin1 != null && admin1.getPassword().equals(admin.getPassword())) {
            // 登录成功，将管理员信息存储在会话中
            request.getSession().setAttribute("admin", admin1);
            return "redirect:/emp/show";
        } else {
            // 登录失败，重定向到登录页面
            return "redirect:/login.jsp";
        }
    }


    /**
     *  注册
     * @param admin
     */
    @RequestMapping("register")
    public String register(Admin admin){
        String password = admin.getPassword();
        admin.setPassword(password);
        adminService.register(admin);
        return "redirect:/login.jsp";
    }

    /**
     * 注销登录
     * @return
     */
    @RequestMapping("destroy")
    public String destroy(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/login.jsp";
    }

}

