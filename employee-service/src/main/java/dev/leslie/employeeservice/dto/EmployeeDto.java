package dev.leslie.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "EmployeeDto Model Information"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    @Schema(
            description = "Employee First Name"
    )
    private String firstName;
    @Schema(
            description = "Employee Last Name"
    )
    private String lastName;
    @Schema(
            description = "Employee Email Address"
    )
    private String email;
    @Schema(
            description = "Employee Department Code"
    )
    private String departmentCode;
    @Schema(
            description = "Employee Organization Code"
    )
    private String organizationCode;
}
