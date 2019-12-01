package com.wanfadger.courseapi.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wanfadger.courseapi.models.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
	
	public List<Course> findCoursesByTopicId(long topicId);

	
}
