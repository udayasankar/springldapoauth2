package com.example.demo.repository;


import com.example.demo.domain.RandomCity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RandomCityRepository extends JpaRepository<RandomCity, Long> {
}
