package com.example.springbootjpatutorial.repository;

import com.example.springbootjpatutorial.entity.Course;
import com.example.springbootjpatutorial.entity.Student;
import com.example.springbootjpatutorial.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable
    );




}