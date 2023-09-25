package com.hv.ats.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private long id;
    private String password;
    private String firstName;
    private String lastName;
    private String applications;

}
