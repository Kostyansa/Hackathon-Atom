package com.example.service.impl;

import com.example.domain.entity.EntityEmployer;
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
public class ServiceEmployerImpl implements ServiceEmployer {

    private final ServiceStudent serviceStudent;
    private final ServiceEdOrg serviceEdOrg;

    private final EntityStudentRepository entityStudentRepository;
    private final EntityEdOrgRepository entityEdOrgRepository;
    private final EntityEmployerRepository entityEmployerRepository;

    @Override
    public EntityEmployer get(UUID id) {
        return null;
    }

    @Override
    public EntityEmployer update(EntityEmployer entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public EntityEmployer create(EntityEmployer entity) {
        return null;
    }
}
