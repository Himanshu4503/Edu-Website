package com.example.eduwebsite.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.eduwebsite.entity.User;

public interface UserRepository extends JpaRepository<User, Long> , PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {
    Optional<User> findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
    void deleteByEmail(String email);

}
