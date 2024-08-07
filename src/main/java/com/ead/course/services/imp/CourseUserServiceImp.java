package com.ead.course.services.imp;

import com.ead.course.repositories.CourseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImp {

    @Autowired
    CourseUserRepository courseUserRepository;
}
