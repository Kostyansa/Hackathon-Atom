package com.example.web;

import com.example.domain.entity.EntityStudent;
import com.example.service.*;
import com.example.web.mapper.MapperDtoStudent;
import com.example.web.mapper.MapperDtoEmployer;
import com.example.web.mapper.MapperDtoEdOrg;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/one")
public class ControllerStudent {
    private final ServiceStudent serviceStudent;
    private final ServiceEdOrg serviceEdOrg;
    private final ServiceEmployer serviceEmployer;
    private final MessageDispatcher messageDispatcher;
    private final ProcessManager processManager;

    private final MapperDtoStudent mapperDtoStudent;
    private final MapperDtoEdOrg mapperDtoEdOrg;
    private final MapperDtoEmployer mapperDtoEmployer;

    @GetMapping
    public ResponseEntity get(@RequestParam UUID id) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping
    public ResponseEntity update(@RequestBody EntityStudent entityStudent) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity create(@RequestBody EntityStudent entityStudent) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam UUID id) {
        return ResponseEntity.ok().build();
    }

}
