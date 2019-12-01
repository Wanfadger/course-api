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
import com.wanfadger.courseapi.models.Lesson;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.services.CourseService;
import com.wanfadger.courseapi.services.LessonService;


@RestController
@RequestMapping("api")
public class LessonController {

	@Autowired
	private LessonService lessonService;  
	
	 @PostMapping("/topics/{topicId}/courses/{courseId}/lessons") 
	public void addLesson(@RequestBody Lesson lesson , @PathVariable("courseId") long courseId) {
		 Course course = new Course(courseId);
	        lesson.setCourse(course);
	          lessonService.addLesson(lesson);	
			}
	 
	 @GetMapping("/topics/{topicId}/courses/{courseId}/lessons")
		 public List<Lesson> getAllLessons(@PathVariable("courseId") long courseId){
			 return lessonService.getAllLessons(courseId);
			 }
		 
	 @GetMapping("/topics/{topicId}/courses/{courseId}/lesson/{id}")
		 public Optional<Lesson> getLesson(@PathVariable("id") long id ) {
			 return lessonService.getLesson(id);
		 }
	
	 @DeleteMapping("/topics/{topicId}/courses/{courseId}/lesson/{id}")
	 public void deleteCourse(@PathVariable("id") long id) {
		  lessonService.deleteLesson(id);
		}
	 
 
	 @PutMapping("/topics/{topicId}/courses/{courseId}/lesson/{id}")
	public void updateCourse(@PathVariable("id") long id , @PathVariable("courseId") long courseId  , @RequestBody Lesson lesson) {
		  Course course = new Course(courseId);
          lesson.setCourse(course);
		 course.setId(id);
		 lessonService.updateLesson(lesson);
		}
	 
}
