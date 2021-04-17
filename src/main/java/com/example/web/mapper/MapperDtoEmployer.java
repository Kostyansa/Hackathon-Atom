package com.example.web.mapper;

import com.example.domain.entity.EntityEmployer;
import com.example.web.dto.DtoEmployer;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface MapperDtoEmployer extends Function<DtoEmployer, EntityEmployer> {
}
