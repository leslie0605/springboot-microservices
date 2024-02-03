package dev.leslie.organizationservice.service.impl;

import dev.leslie.organizationservice.dto.OrganizationDto;
import dev.leslie.organizationservice.entity.Organization;
import dev.leslie.organizationservice.mapper.OrganizationMapper;
import dev.leslie.organizationservice.repository.OrganizationRepository;
import dev.leslie.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
