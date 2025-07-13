package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StudentService接口的实现类，负责处理学生相关的业务逻辑
 */
@Service
public class StudentServiceImpl implements StudentService {

    /**
 * 学生数据访问接口的实例，通过构造函数注入
 */
private final StudentRepository studentRepository;

    /**
 * 构造函数，注入StudentRepository依赖
 * @param studentRepository 学生数据访问接口
 */
public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
 * 获取所有学生信息
 * @return 所有学生的列表
 */
@Override
public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
 * 根据ID获取学生信息
 * @param id 学生ID
 * @return 对应的学生对象，如果不存在则返回null
 */
@Override
public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
 * 保存或更新学生信息
 * @param student 学生对象
 * @return 保存或更新后的学生对象
 */
@Override
public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
 * 根据ID删除学生信息
 * @param id 学生ID
 */
@Override
public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}