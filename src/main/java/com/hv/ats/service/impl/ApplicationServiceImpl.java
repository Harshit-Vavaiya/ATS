package com.hv.ats.service.impl;

import com.hv.ats.dto.ApplicationDto;
import com.hv.ats.models.Application;
import com.hv.ats.repository.ApplicationRepository;
import com.hv.ats.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<ApplicationDto> findAllByUserId(long id) {
        List<Application> applications = applicationRepository.findAllByUserId(id);

        return applications.stream().map((application) -> mapToApplicationDto(application)).collect(Collectors.toList());
    }

    private ApplicationDto mapToApplicationDto(Application application){
        ApplicationDto applicationDto = ApplicationDto.builder()
                .id(application.getId())
                .userId(application.getUserId())
                .company(application.getCompany())
                .role(application.getRole())
                .platform(application.getPlatform())
                .description(application.getDescription())
                .appliedOn(application.getAppliedOn())
                .coverLetter(application.getCoverLetter())
                .resume(application.getResume())
                .tags(application.getTags())
        .build();
        return applicationDto;
    }
}
