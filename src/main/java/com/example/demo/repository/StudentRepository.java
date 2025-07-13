package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 学生数据访问接口，继承JpaRepository提供基本CRUD操作
 * 泛型参数：Student(实体类), Long(主键类型)
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}