package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Topic;

public interface TopicService {

    public Topic saveOrUpdate(Topic topic);

    public List<Topic> findAllTopic();

    public void delete(Integer id);

    public Topic findTopicById(Integer id);
}
