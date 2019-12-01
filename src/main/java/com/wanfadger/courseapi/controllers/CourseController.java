package com.wanfadger.courseapi.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanfadger.courseapi.models.Course;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.services.CourseService;


@RestController
@RequestMapping("api")
public class CourseController {

	@Autowired
	private CourseService courseService;  
	
	 @PostMapping("/topics/{topicId}/courses") 
	public void addCourse(@RequestBody Course course , @PathVariable("topicId") long topicId) {
		   Topic topic = new Topic(topicId);
	          course.setTopic(topic);
			 courseService.addCourse(course);	
			}
	 
	 @GetMapping("/topics/{topicId}/courses")
		 public List<Course> getAllCourses( @PathVariable("topicId") long topicId){
			 return courseService.getAllCourses(topicId);
		 }
		 
	 @GetMapping("/topics/{topicId}/courses/{id}")
		 public Optional<Course> getCourse(@PathVariable("id") long id ) {
			 return courseService.getCourse(id);
		 }
	
	 @DeleteMapping("/topics/{topicId}/courses/{id}")
	 public void deleteCourse(@PathVariable("id") long id) {
		  courseService.deleteCourse(id);
		}
	 
 
	 @PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable("id") long id , @PathVariable("topicId") long topicId  , @RequestBody Course course) {
		  Topic topic = new Topic(topicId);
          course.setTopic(topic);
		 course.setId(id);
		 courseService.updateCourse(course);
		}
	 
}
