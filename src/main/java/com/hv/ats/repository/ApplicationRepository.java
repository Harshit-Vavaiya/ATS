package com.hv.ats.repository;

import com.hv.ats.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application,Long> {

    @Override
    List<Application> findAll();

    List<Application> findAllByUserId(Long id);
}
