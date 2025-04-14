package com.example.eduwebsite.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eduwebsite.entity.Course;
import com.example.eduwebsite.entity.Enrollment;
import com.example.eduwebsite.entity.User;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    long countByUserId(Long userId);
    void deleteByUserId(Long userId);

    // New method to find enrollments by user ID
    List<Enrollment> findByUserId(Long userId);
    Optional<Enrollment> findByCourseAndUser(Course course, User user);
}
