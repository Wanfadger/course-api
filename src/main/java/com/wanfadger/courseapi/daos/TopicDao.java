package com.wanfadger.courseapi.daos;

import java.util.List;
import java.util.UUID;

import com.wanfadger.courseapi.models.Topic;

public interface TopicDao {

	public UUID insertTopic(Topic topic);
	public List<Topic> selectAllTopics();
	public Topic selectTopic(UUID id);
	
	public UUID deleteTopic(UUID id);
	public UUID updateTopic(Topic topic);
	
}
