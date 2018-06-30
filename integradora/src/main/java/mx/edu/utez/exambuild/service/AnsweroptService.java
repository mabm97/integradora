package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Answeropt;

public interface AnsweroptService {

    public Answeropt saveOrUpdate(Answeropt answeropt);

    public List<Answeropt> findAllAnsweropt();

    public void delete(Integer id);

    public Answeropt findAnsweroptById(Integer id);
}
