package com.example.Job.Search.Portal.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Validated
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @NotNull
    private Long id;
    @NotBlank
    private String title;

    private String description;
    @NotBlank(message = "Location of company is required")
    private String location;

    @NotNull(message = "")
    @Min(value = 20000, message = "Salary should be at least 20000")
    @Max(value =50000, message = "max not limit") //(hint @min for salary : should be above 20,000 )
    @NotNull(message = "company email is required")
    private String companyEmail;
    @NotNull(message = "company name is required")
    private String companyName;
    @NotNull(message = "company employee is required")
    private String employerName;

    @NotNull(message = "Date is required")
    private LocalDate appliedDate;
}
