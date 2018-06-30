package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Question;

public interface QuestionService {

    public Question saveOrUpdate(Question question);

    public List<Question> findAllQuestion();

    public void delete(Integer id);

    public Question findQuestionById(Integer id);
}
