package com.example.service;

import com.example.domain.entity.EntityEmployer;

import java.util.UUID;

public interface ServiceEmployer {

    EntityEmployer get(UUID id);

    EntityEmployer update(EntityEmployer entity);

    void delete(UUID id);

    EntityEmployer create(EntityEmployer entity);

}
