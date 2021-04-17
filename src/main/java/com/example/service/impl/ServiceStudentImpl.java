package com.example.service.impl;

import com.example.domain.entity.EntityStudent;
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
public class ServiceStudentImpl implements ServiceStudent {

    private final ServiceEdOrg serviceEdOrg;
    private final ServiceEmployer serviceEmployer;

    private final EntityStudentRepository entityStudentRepository;
    private final EntityEdOrgRepository entityEdOrgRepository;
    private final EntityEmployerRepository entityEmployerRepository;

    @Override
    public EntityStudent get(UUID id) {
        return null;
    }

    @Override
    public EntityStudent update(EntityStudent entity) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public EntityStudent create(EntityStudent entity) {
        return null;
    }
}
