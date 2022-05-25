package com.java.controller;

import com.java.entity.Student;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liujixiang
 * @description well-done
 * @time 2022/5/4 15:33
 */
@Controller(value = "aa")
@RequestMapping("/test")
public class TestController2 {
    @RequestMapping("/a1")
    public ModelAndView a1(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name","lisi");
        mav.setViewName("new");
        System.out.println("haahhh");
        return mav;
    }

    @RequestMapping("/a2")
    public String a2(HttpServletRequest request, HttpServletResponse response){
            request.getSession().setAttribute("name","wangwu");
           // request.getRequestDispatcher("new").forward(request,response);
           // response.sendRedirect("new");
            return "redirect:/pages/pages/new.jsp";
    }

    @RequestMapping("/a3")
    public @ResponseBody
    Student a3(){
        Student student=new Student("zhangsan","19");
        return student;
    }


}
