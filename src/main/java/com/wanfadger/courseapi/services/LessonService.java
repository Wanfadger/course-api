package com.wanfadger.courseapi.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanfadger.courseapi.daoImpl.LessonDaoImpl;
import com.wanfadger.courseapi.models.Lesson;


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
