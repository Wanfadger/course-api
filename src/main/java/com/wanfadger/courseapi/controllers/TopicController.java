package com.wanfadger.courseapi.controllers;

import java.util.List;
import java.util.Optional;


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
	public void addTopic(@RequestBody Topic topic) {
			 topicService.addTopic(topic);	
			}
	 
	 @GetMapping
		 public List<Topic> getAllTopics(){
			 return topicService.getAllTopics();
		 }
		 
	 @GetMapping("/{id}")
		 public Optional<Topic> getTopic(@PathVariable("id") long id) {
			 return topicService.getTopic(id);
		 }
	
	 @DeleteMapping("/{id}")
	 public void deleteTopic(@PathVariable("id") long id) {
		  topicService.deleteTopic(id);
		}
	 
 
	 @PutMapping("/{id}")
	public void updateTopic(@PathVariable("id") long id ,  @RequestBody Topic topic) {
		 topic.setId(id);
		 topicService.updateTopic(topic);
		}
	 
}
