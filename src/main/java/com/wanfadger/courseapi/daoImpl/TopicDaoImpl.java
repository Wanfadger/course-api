package com.wanfadger.courseapi.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.repository.TopicRepository;

@Repository
public class TopicDaoImpl {

	@Autowired
	private TopicRepository topicRepository;
	

	public void insertTopic(Topic topic) {
         topicRepository.save(topic);
	}

	public List<Topic> selectAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach((topic) -> { topics.add(topic); });
		return topics;
	}


	public Optional<Topic> selectTopic(long id) {
    return topicRepository.findById(id);
	}


	public void deleteTopic(long id) {
	 topicRepository.deleteById(id);
	}

	public void updateTopic(Topic topic) {
     topicRepository.save(topic);	
	}

}
