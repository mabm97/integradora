package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Historyexam;

public interface HistoryexamService {

    public Historyexam saveOrUpdate(Historyexam historyexam);

    public List<Historyexam> findAllHistoryexam();

    public void delete(Integer id);

    public Historyexam findHistoryexamById(Integer id);
}
