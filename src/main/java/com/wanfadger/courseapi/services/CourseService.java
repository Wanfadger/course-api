package com.wanfadger.courseapi.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanfadger.courseapi.daoImpl.CourseDaoImpl;
import com.wanfadger.courseapi.daoImpl.TopicDaoImpl;
import com.wanfadger.courseapi.models.Course;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.repository.TopicRepository;

@Service
public class CourseService {
	 @Autowired
	private CourseDaoImpl courseDaoImpl;
	 
	
	 public void addCourse(Course course) {
		 courseDaoImpl.insertCourse(course);
	 }
	 
	 public List<Course> getAllCourses(long topicId){
		return courseDaoImpl.selectAllCourses(topicId);
	 }
	 
	 public Optional<Course> getCourse(long id) {
		 return courseDaoImpl.selectCourse(id);
	 }
	 
	 public void deleteCourse(long id) {
		  courseDaoImpl.deleteCourse(id); ;
		}


		public void updateCourse(Course course) {
		 courseDaoImpl.updateCourse(course);
		}
	

}
