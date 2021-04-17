package com.example.web.mapper;

import com.example.domain.entity.EntityEdOrg;
import com.example.web.dto.DtoEdOrg;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface MapperDtoEdOrg extends Function<DtoEdOrg, EntityEdOrg> {
}
