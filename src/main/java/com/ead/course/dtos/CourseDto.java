package com.ead.course.dtos;

import com.ead.course.enums.CourseStatus;
import com.ead.course.enums.CouserLevel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
public class CourseDto {

    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private String imageUrl;
    @NotBlank
    private CourseStatus courseStatus;
    @NotBlank
    private UUID userInstructor;
    @NotBlank
    private CouserLevel courseLevel;

}
