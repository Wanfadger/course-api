package com.wanfadger.courseapi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanfadger.courseapi.models.Topic;
import com.wanfadger.courseapi.services.TopicService;

@RestController
@RequestMapping("api/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	 @PostMapping 
	public UUID addTopic(@RequestBody Topic topic) {
			return topicService.addTopic(topic);	
			}
	 
	 @GetMapping
		 public List<Topic> getAllTopics(){
			 return topicService.getAllTopics();
		 }
		 
	 @GetMapping("/{id}")
		 public Topic getTopic(@PathVariable("id") UUID id) {
			 return topicService.getTopic(id);
		 }
	
	 @DeleteMapping("/{id}")
	 public UUID deleteTopic(@PathVariable("id") UUID id) {
		 return topicService.deleteTopic(id);
		}
	 
 
	 @PutMapping
	public UUID updateTopic(@RequestBody Topic topic) {
			return topicService.updateTopic(topic);
		}
	 
}
