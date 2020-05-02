package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Clrvn
 */
@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        session.getServletContext().removeAttribute(session.getId());
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpSession session, Model model) {
        /*//默认，不用登录
        UserVO user2 = new UserVO();
        User user = new User();
        user.setId(1);
        user.setName("chen");
        user.setPassword("123qwe");
        user.setRoleId(4);

        user2.setUser(user);
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        role.setAuths("客户信息管理,客户拜访计划定制,客户拜访统计,客户拜访计划执行,年计划页,后台管理");

        user2.setRole(role);

        // 测试时取消前三行，加上后三行注释

        *//*session.setAttribute("USER", user2);
        model.addAttribute("auths", user2.getRole().getAuths());
        return "index";*//*


        UserVO userVo = (UserVO) session.getAttribute("USER");
        model.addAttribute("auths", userVo.getRole().getAuths());*/
        return "index";


    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    /**
     * 用户管理
     */
    @GetMapping("/userManage")
    public String userManage() {
        return "userManage";
    }

    @GetMapping("/userAdd")
    public String userAdd() {
        return "userAdd";
    }

    @GetMapping("/userEdit")
    public String userEdit() {
        return "userEdit";
    }

    @GetMapping("/userView")
    public String userView() {
        return "userView";
    }

    /**
     * 家政服务管理
     */
    @GetMapping("/cleanManage")
    public String cleanManage() {
        return "cleanManage";
    }

    @GetMapping("/cleanAdd")
    public String cleanAdd() {
        return "cleanAdd";
    }

    @GetMapping("/cleanEdit")
    public String cleanEdit() {
        return "cleanEdit";
    }

    @GetMapping("/cleanView")
    public String cleanView() {
        return "cleanView";
    }


    /**
     * 分类
     */
    @GetMapping("/categoryManage")
    public String categoryManage() {
        return "categoryManage";
    }

    @GetMapping("/categoryAdd")
    public String categoryAdd() {
        return "categoryAdd";
    }

    @GetMapping("/categoryEdit")
    public String categoryEdit() {
        return "categoryEdit";
    }

    @GetMapping("/categoryView")
    public String categoryView() {
        return "categoryView";
    }

    /**
     * 留言管理
     */
    @GetMapping("/commentManage")
    public String commentManage() {
        return "commentManage";
    }

    @GetMapping("/commentAdd")
    public String commentAdd() {
        return "commentAdd";
    }

    @GetMapping("/commentEdit")
    public String commentEdit() {
        return "commentEdit";
    }

    @GetMapping("/commentView")
    public String commentView() {
        return "commentView";
    }


    /**
     * 资讯管理
     */
    @GetMapping("/newsManage")
    public String newsManage() {
        return "newsManage";
    }

    @GetMapping("/newsAdd")
    public String newsAdd() {
        return "newsAdd";
    }

    @GetMapping("/newsEdit")
    public String newsEdit() {
        return "newsEdit";
    }

    @GetMapping("/newsView")
    public String newsView() {
        return "newsView";
    }




}
