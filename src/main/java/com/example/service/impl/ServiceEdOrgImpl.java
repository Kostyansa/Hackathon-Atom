package com.example.service.impl;

import com.example.domain.entity.EntityEdOrg;
import com.example.domain.repository.EntityStudentRepository;
import com.example.domain.repository.EntityEmployerRepository;
import com.example.domain.repository.EntityEdOrgRepository;
import com.example.service.ServiceStudent;
import com.example.service.ServiceEmployer;
import com.example.service.ServiceEdOrg;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ServiceEdOrgImpl implements ServiceEdOrg {

    private final ServiceStudent serviceStudent;
    private final ServiceEmployer serviceEmployer;

    private final EntityStudentRepository entityStudentRepository;
    private final EntityEdOrgRepository entityEdOrgRepository;
    private final EntityEmployerRepository entityEmployerRepository;

    @Override
    public EntityEdOrg get(UUID id) {
        return null;
    }

    @Override
    public EntityEdOrg update(EntityEdOrg entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public EntityEdOrg create(EntityEdOrg entity) {
        return null;
    }
}
