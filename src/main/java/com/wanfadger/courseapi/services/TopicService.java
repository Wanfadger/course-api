package com.wanfadger.courseapi.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanfadger.courseapi.daoImpl.TopicDaoImpl;
import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.repository.TopicRepository;

@Service
public class TopicService {
	 @Autowired
	private TopicDaoImpl topicDaoImpl;
	
	 public void addTopic(Topic topic) {
		 topicDaoImpl.insertTopic(topic);
	 }
	 
	 public List<Topic> getAllTopics(){
		return topicDaoImpl.selectAllTopics();
	 }
	 
	 public Optional<Topic> getTopic(long id) {
		 return topicDaoImpl.selectTopic(id);
	 }
	 
	 public void deleteTopic(long id) {
		  topicDaoImpl.deleteTopic(id);
		}


		public void updateTopic(Topic topic) {
		 topicDaoImpl.updateTopic(topic);
		}
	

}
