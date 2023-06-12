package com.spring.web.dto;

import com.spring.customAnnotations.ValidRoleName;

import lombok.Data;

@Data
public class RoleDto {
    Long id;
    @ValidRoleName
    String name;
}
