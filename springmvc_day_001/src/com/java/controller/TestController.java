package com.java.controller;

import com.java.entity.Student;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

/**
 * @author liujixiang
 * @description well-done
 * @time 2022/5/2 16:23
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public ModelAndView test(ModelAndView modelAndView) {
        System.out.println("test/test......");
        //request.getDispatcherServlet("/a.jsp").forward(req,resp);
        // request.getSession().setAttribute("name","张三");

        //ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name", "张三");
        modelAndView.setViewName("test1");
        //return "redirect:/test.jsp";
        return modelAndView;
        //return "forward:/test.jsp";
    }

    @RequestMapping("/test2")
    public @ResponseBody
    String test2() {
        System.out.println("test/test2.......");
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("name","lisi");
        //return "/pages/pages/test.jsp";
        return "test";
    }

    @RequestMapping("/test4")
    public ModelAndView test4() {
        System.out.println("test/test4.......");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "lisi");
        List<Student> studentList1 = Arrays.asList(new Student("zhangsan", "12"), new Student("lisi", "13"), new Student("wangwu", "14"));
        modelAndView.addObject("list",studentList1);
        //return "/pages/pages/test.jsp";
        modelAndView.setViewName("v");
        return modelAndView;
    }

    @RequestMapping("/test1")
    public void test1(@RequestParam(value = "name1", required = false) String name11, @RequestParam("age") String age1) {
        System.out.println(name11);
        System.out.println(age1);
    }

    @RequestMapping("/test3")
    public String test3(Student student) {
        System.out.println(student);
        return "hhh";
    }


    @RequestMapping("/test5")
    public @ResponseBody
    List<Student> selectStudentList() {
        //List<Student> studentList=new ArrayList<>();
        List<Student> studentList1 = Arrays.asList(new Student("zhangsan", "12"), new Student("lisi", "13"), new Student("wangwu", "14"));
        return studentList1;
    }

    @RequestMapping("/test6")
    public ModelAndView selectStudentList6() {
        //List<Student> studentList=new ArrayList<>();
        List<Student> studentList1 = Arrays.asList(new Student("zhangsan", "12"), new Student("lisi", "13"), new Student("wangwu", "14"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("v");
        modelAndView.addObject("studentList", studentList1);
        return modelAndView;
    }

    @RequestMapping("/test7")
    public @ResponseBody
    Map<String, Object> selectStudentList7() {
        //List<Student> studentList=new ArrayList<>();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("name", "zhangsan");
        //ModelAndView modelAndView=new ModelAndView();
        //  modelAndView.setViewName("v");
        return resultMap;
        // return modelAndView;
    }


    @RequestMapping("/test11.do")
    public @ResponseBody
    Student selectStudentList11() {
        //List<Student> studentList=new ArrayList<>();

        return new Student("zhangsan","12");
        // return modelAndView;
    }

    @RequestMapping("/test8")
    @ResponseBody
    public
    String selectStudentList8() throws JSONException {
        System.out.println("test8................");
        //List<Student> studentList=new ArrayList<>();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("name", "zhangsan");
        //ModelAndView modelAndView=new ModelAndView();
        //  modelAndView.setViewName("v");
        String s = JSONObject.valueToString(resultMap);
        return s;
        // return modelAndView;
    }

    @RequestMapping("/test9")
    public @ResponseBody
    int selectStudentList9() {
        //List<Student> studentList=new ArrayList<>();
        //Map<String, Object> resultMap = new HashMap<>();
        //resultMap.put("name", "zhangsan");
        //ModelAndView modelAndView=new ModelAndView();
        //  modelAndView.setViewName("v");
        return 1;
        // return modelAndView;
    }

}


