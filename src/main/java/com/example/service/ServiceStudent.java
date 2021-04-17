package com.example.service;

import com.example.domain.entity.EntityStudent;

import java.util.UUID;

public interface ServiceStudent {

    EntityStudent get(UUID id);

    EntityStudent update(EntityStudent entity);

    void delete(UUID id);

    EntityStudent create(EntityStudent entityStudent);

}
