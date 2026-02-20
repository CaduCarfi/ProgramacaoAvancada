package com.example.demo.repositories;

import com.example.demo.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PofessorRepository extends JpaRepository<Professor,Long> {
}
