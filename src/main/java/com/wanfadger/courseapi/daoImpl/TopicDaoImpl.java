package com.wanfadger.courseapi.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;
import com.wanfadger.courseapi.daos.TopicDao;
import com.wanfadger.courseapi.models.Topic;

@Repository
public class TopicDaoImpl implements TopicDao {
	private static List<Topic> topics = new ArrayList<>();

	@Override
	public UUID insertTopic(Topic topic) {
	UUID uuid = UUID.randomUUID();
	topic.setuId(uuid);
	topics.add(topic);
		return topic.getuId();
	}

	@Override
	public List<Topic> selectAllTopics() {
		return topics;
	}

	@Override
	public Topic selectTopic(UUID id) {
	 return topics.stream()
				.filter((topic) -> topic.getuId().equals(id))
				.findFirst()
				.get();
	}

}
