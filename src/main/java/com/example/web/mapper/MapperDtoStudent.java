package com.example.web.mapper;

import com.example.domain.entity.EntityStudent;
import com.example.web.dto.DtoStudent;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface MapperDtoStudent extends Function<DtoStudent, EntityStudent> {
}
