package com.wanfadger.courseapi.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wanfadger.courseapi.models.Lesson;
import com.wanfadger.courseapi.repository.LessonRepository;

@Repository
public class LessonDaoImpl {

	@Autowired
	private LessonRepository lessonRepository;
	

	public void insertLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}

	public List<Lesson> selectAllLessons(long courseId) {
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findLessonByCourseId(courseId).forEach( (lesson) -> {lessons.add(lesson);}  );
		return lessons;
	}


	public Optional<Lesson> selectLesson(long id) {
    return lessonRepository.findById(id);
	}


	public void deleteLesson(long id) {
		lessonRepository.deleteById(id);
	}

	public void updateLesson(Lesson lesson) {
		lessonRepository.save(lesson);	
	}

}
