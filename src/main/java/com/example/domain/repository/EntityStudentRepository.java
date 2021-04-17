package com.example.domain.repository;

import com.example.domain.entity.EntityStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityStudentRepository extends JpaRepository<EntityStudent, UUID> {
}
