package com.example.demo.entity;

import jakarta.persistence.*;

/**
 * 学生实体类
 * 表示系统中的学生信息
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /** 学生姓名 */
    private String name;
    
    /** 学号 */
    private String studentId;
    
    /** 班级名称 */
    private String className;
    
    /** 专业 */
    private String major;
    
    // Getters and Setters
    /**
     * 获取学生ID
     * @return 学生ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置学生ID
     * @param id 学生ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取学生姓名
     * @return 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学号
     * @return 学号
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学号
     * @param studentId 学号
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取班级名称
     * @return 班级名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置班级名称
     * @param className 班级名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取专业
     * @return 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }
}