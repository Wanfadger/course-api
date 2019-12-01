package com.wanfadger.courseapi.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanfadger.courseapi.daos.TopicDao;
import com.wanfadger.courseapi.models.Topic;

@Service
public class TopicService {
	 @Autowired
	private TopicDao topicDao;
	
	 public UUID addTopic(Topic topic) {
		return topicDao.insertTopic(topic);
	 }
	 
	 public List<Topic> getAllTopics(){
		 return topicDao.selectAllTopics();
	 }
	 
	 public Topic getTopic(UUID id) {
		 return topicDao.selectTopic(id);
	 }
	 
	 public UUID deleteTopic(UUID id) {
		 return topicDao.deleteTopic(id);
		}


		public UUID updateTopic(Topic topic) {
			return topicDao.updateTopic(topic);
		}
	

}
