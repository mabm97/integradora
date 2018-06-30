package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Exam;

public interface ExamService {

    public Exam saveOrUpdate(Exam exam);

    public List<Exam> findAllExam();

    public void delete(Integer id);

    public Exam findExamById(Integer id);
}
