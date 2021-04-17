package com.example.domain.repository;

import com.example.domain.entity.EntityEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityEmployerRepository extends JpaRepository<EntityEmployer, UUID> {
}
