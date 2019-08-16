package com.example.girl1.repository;

import com.example.girl1.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
