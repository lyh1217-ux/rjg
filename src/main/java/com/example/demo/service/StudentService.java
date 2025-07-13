package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;

/**
 * 学生服务接口，定义学生相关的业务操作
 */
public interface StudentService {
    /**
     * 获取所有学生信息
     * @return 所有学生的列表
     */
    List<Student> getAllStudents();
    /**
     * 根据ID获取学生信息
     * @param id 学生ID
     * @return 对应的学生对象
     */
    Student getStudentById(Long id);
    /**
     * 保存或更新学生信息
     * @param student 学生对象
     * @return 保存或更新后的学生对象
     */
    Student saveStudent(Student student);
    /**
     * 根据ID删除学生信息
     * @param id 学生ID
     */
    void deleteStudent(Long id);
}