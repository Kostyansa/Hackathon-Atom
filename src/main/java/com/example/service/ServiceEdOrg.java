package com.example.service;

import com.example.domain.entity.EntityEdOrg;

import java.util.UUID;

public interface ServiceEdOrg {

    EntityEdOrg get(UUID id);

    EntityEdOrg update(EntityEdOrg entity);

    void delete(UUID id);

    EntityEdOrg create(EntityEdOrg entity);

}
