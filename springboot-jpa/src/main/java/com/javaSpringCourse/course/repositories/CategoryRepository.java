package com.javaSpringCourse.course.repositories;

import com.javaSpringCourse.course.entities.Category;
import com.javaSpringCourse.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
