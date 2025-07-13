-- 创建数据库
CREATE DATABASE IF NOT EXISTS student_management;
USE student_management;

-- 创建学生表
CREATE TABLE IF NOT EXISTS student (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    student_id VARCHAR(20) NOT NULL UNIQUE,
    class_name VARCHAR(50) NOT NULL,
    major VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入示例数据
INSERT INTO student (name, student_id, class_name, major) VALUES
('张三', '2023001', '计算机1班', '计算机科学与技术'),
('李四', '2023002', '计算机2班', '软件工程'),
('王五', '2023003', '网络1班', '网络工程');

-- 创建索引
CREATE INDEX idx_student_name ON student(name);
CREATE INDEX idx_student_class ON student(class_name);