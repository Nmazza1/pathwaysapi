package com.pathwaysedu.app.rest.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseRequest {

    @NotBlank
    private String courseName;
    @NotBlank
    private String courseLink;

    @NotNull
    private Integer prerequisite;
}