package com.ead.course.repositories;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {


    @Query(value = "SELECT * FROM tb_modules WHERE course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllLModulesIntoCourse(@Param("courseId") UUID courseId);


}
