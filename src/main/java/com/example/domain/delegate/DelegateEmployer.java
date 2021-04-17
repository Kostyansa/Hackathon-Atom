package com.example.domain.delegate;

import com.example.domain.repository.EntityStudentRepository;
import com.example.domain.repository.EntityEmployerRepository;
import com.example.domain.repository.EntityEdOrgRepository;
import com.example.service.ServiceStudent;
import com.example.service.ServiceEmployer;
import com.example.service.ServiceEdOrg;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DelegateEmployer implements JavaDelegate {

    private final ServiceStudent serviceStudent;
    private final ServiceEdOrg serviceEdOrg;
    private final ServiceEmployer serviceEmployer;

    private final EntityStudentRepository entityStudentRepository;
    private final EntityEdOrgRepository entityEdOrgRepository;
    private final EntityEmployerRepository entityEmployerRepository;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}
