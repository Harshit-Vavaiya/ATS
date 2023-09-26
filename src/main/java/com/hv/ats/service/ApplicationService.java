package com.hv.ats.service;

import com.hv.ats.dto.ApplicationDto;

import java.util.List;

public interface ApplicationService {

    List<ApplicationDto> findAll();

    List<ApplicationDto> findAllByUserId(long id);
}
