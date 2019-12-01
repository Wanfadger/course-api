package com.wanfadger.courseapi.repository;


import org.springframework.data.repository.CrudRepository;

import com.wanfadger.courseapi.models.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long>{
	
}
