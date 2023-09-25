package com.hv.ats.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationDto {

    private long id;

    private long userId;

    private String company;

    private String description;

    private String role;

    private String platform;

    private String appliedOn;

    private String resume;

    private String coverLetter;

    private String tags;

}
