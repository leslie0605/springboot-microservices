package dev.leslie.organizationservice.service;

import dev.leslie.organizationservice.dto.OrganizationDto;

public interface OrganizationService{
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
}
