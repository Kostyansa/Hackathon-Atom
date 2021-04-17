package com.example.domain.repository;

import com.example.domain.entity.EntityEdOrg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityEdOrgRepository extends JpaRepository<EntityEdOrg, UUID> {
}
