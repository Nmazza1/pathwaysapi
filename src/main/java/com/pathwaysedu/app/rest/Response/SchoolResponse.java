package com.pathwaysedu.app.rest.Response;

import com.pathwaysedu.app.rest.Entity.School;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolResponse {
    private long id;
    private String schoolName;
    private String schoolImgUrl;
    private String region;

    public SchoolResponse(School school){
        id = school.getId();
        schoolName = school.getSchoolName();
        schoolImgUrl = school.getSchoolImgUrl();
        region = school.getRegion();
    }
}