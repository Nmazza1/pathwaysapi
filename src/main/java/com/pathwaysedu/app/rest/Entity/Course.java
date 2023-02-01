package com.pathwaysedu.app.rest.Entity;

import com.pathwaysedu.app.rest.Request.CourseRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_link")
    private String courseLink;


    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idschool")
    private School school;

    // Prerequisite is a binary representation of the requirements for the course
    @Column(name = "prerequisite")
    private Integer prerequisite;

    public Course(CourseRequest courseRequest) {
        courseName = courseRequest.getCourseName();
        courseLink = courseRequest.getCourseLink();
        prerequisite = courseRequest.getPrerequisite();

    }
}
