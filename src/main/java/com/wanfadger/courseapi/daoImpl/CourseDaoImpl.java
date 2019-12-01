package com.wanfadger.courseapi.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wanfadger.courseapi.models.Course;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.repository.CourseRepository;
import com.wanfadger.courseapi.repository.TopicRepository;

@Repository
public class CourseDaoImpl {

	@Autowired
	private CourseRepository courseRepository;
	

	public void insertCourse(Course course) {
         courseRepository.save(course);
	}

	public List<Course> selectAllCourses(long topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findCoursesByTopicId(topicId).forEach((course) -> { courses.add(course); });
		return courses;
	}


	public Optional<Course> selectCourse(long id) {
    return courseRepository.findById(id);
	}


	public void deleteCourse(long id) {
	 courseRepository.deleteById(id);
	}

	public void updateCourse(Course course) {
     courseRepository.save(course);	
	}

}
