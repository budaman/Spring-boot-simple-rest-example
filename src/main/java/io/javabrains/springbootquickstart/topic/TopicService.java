package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author DATA-DOG team
 */
@Service
public class TopicService {
  private List<Topic> topics = new ArrayList<>(Arrays.asList(
      new Topic("spring", "Spring Framework", "Spring Framework Description"),
      new Topic("java", "Core Java", "Java Description"),
      new Topic("javascript", "Javascript", "Javascript Description")
  ));
  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getTopic(String id) {
    return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
  }

  public Topic addTopic(Topic topic) {
     topics.add(topic);
     return topic;
  }

  public Topic updateTopic(String id, Topic topic) {
    for(int i=0; i < topics.size(); i++) {
      Topic t = topics.get(i);
      if(t.getId().equals(id)) {
        topics.set(i, topic);
        return t;
      }
    }
    return topic;
  }

  public Topic deleteTopic(String id) {
    topics.removeIf(t-> t.getId().equals(id));
    return topics.get(0);
  }



}
