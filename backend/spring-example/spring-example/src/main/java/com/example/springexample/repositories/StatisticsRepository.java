package com.example.springexample.repositories;

import org.hibernate.stat.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatisticsRepository extends JpaRepository <UUID, Statistics> {
}
