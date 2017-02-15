package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
					new Topic("spring","Spring Framework","Spring framework Description"),
					new Topic("Java","Core Java","Core Java Description "),
					new Topic("JavaScript","JavaScript","JavaScript Description")
					
					));
			public List<Topic> getAllTopics()
			{
				return topics;
			}
			
			
			
			public Topic getTopic(String id)
			{
				return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
				
			}
			
			// Post Demo 
			public void addTopic(Topic topic) {
				topics.add(topic);
				
			}



			public void updateTopic(String id, Topic topic) {
				for(Topic topic1 : topics)
				{
					if(topic1.getId().equals(id))
					{
						topic1.setId(topic.getId());
						topic1.setDescription(topic.getDescription());
						topic1.setName(topic.getName());
					}
				}
			}



			public void deletetopic(String id) {
				for(Topic t:topics)
				{
					if(t.getId().equals(id))
					{
						topics.remove(t);
					}
				}
				
			}
			
			
		
			
	
	

}
