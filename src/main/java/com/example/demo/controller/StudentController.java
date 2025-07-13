package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 学生信息控制器
 * 处理与学生信息相关的HTTP请求
 */
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * 构造函数注入StudentService
     * @param studentService 学生服务
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 获取所有学生列表
     * @param model 视图模型，用于传递数据到前端
     * @return 学生列表页面路径
     */
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    /**
     * 显示创建学生表单
     * @param model 视图模型
     * @return 学生表单页面路径
     */
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";
    }

    /**
     * 保存学生信息
     * @param student 表单提交的学生数据
     * @return 重定向到学生列表
     */
    @PostMapping
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    /**
     * 显示编辑学生表单
     * @param id 学生ID
     * @param model 视图模型
     * @return 学生表单页面路径
     */
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "students/form";
    }

    /**
     * 删除学生信息
     * @param id 要删除的学生ID
     * @return 重定向到学生列表
     */
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}