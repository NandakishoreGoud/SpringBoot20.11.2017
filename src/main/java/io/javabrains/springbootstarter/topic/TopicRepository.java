package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//getAllTopics()
//getTopic(String id)
//updateTopic(Topic t)
//deleteTopic(String id)
public interface TopicRepository extends CrudRepository<Topic, String>{
	

}
