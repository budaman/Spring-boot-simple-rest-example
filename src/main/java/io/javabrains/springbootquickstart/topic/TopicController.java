package io.javabrains.springbootquickstart.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DATA-DOG team
 */
@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @RequestMapping("/topics")
  public List<Topic> getAllTopics(){
    return topicService.getAllTopics();
  }

  @RequestMapping("/topics/{id}")
  public Topic getTopic(@PathVariable String id) {
    return topicService.getTopic(id);
  }

  @PostMapping(value="/topics")
  public void addTopic(@RequestBody Topic topic){
     topicService.addTopic(topic);
  }

  @PutMapping(value="/topics/{id}")
  public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
    topicService.updateTopic(id, topic);
  }

  @DeleteMapping (value="/topics/{id}")
  public void updateTopic(@PathVariable String id){
    topicService.deleteTopic(id);
  }

}