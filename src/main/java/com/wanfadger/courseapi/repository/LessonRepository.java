package com.wanfadger.courseapi.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wanfadger.courseapi.models.Lesson;

public interface LessonRepository extends CrudRepository<Lesson, Long>{
	
	public List<Lesson> findLessonByCourseId(long courseId);

	
}
