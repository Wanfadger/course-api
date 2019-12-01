package com.wanfadger.courseapi.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanfadger.courseapi.daoImpl.CourseDaoImpl;
import com.wanfadger.courseapi.daoImpl.LessonDaoImpl;
import com.wanfadger.courseapi.daoImpl.TopicDaoImpl;
import com.wanfadger.courseapi.models.Course;
import com.wanfadger.courseapi.models.Lesson;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.repository.TopicRepository;

@Service
public class LessonService {
	 @Autowired
	private LessonDaoImpl lesDaoImpl;
	 
	
	 public void addLesson(Lesson lesson) {
		 lesDaoImpl.insertLesson(lesson);
	 }
	 
	 public List<Lesson> getAllLessons(long courseId){
		return lesDaoImpl.selectAllLessons(courseId);
	 }
	 
	 public Optional<Lesson> getLesson(long id) {
		 return lesDaoImpl.selectLesson(id);
	 }
	 
	 public void deleteLesson(long id) {
		 lesDaoImpl.deleteLesson(id); ;
		}


		public void updateLesson(Lesson lesson) {
			lesDaoImpl.updateLesson(lesson);
		}
	

}
