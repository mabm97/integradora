package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Applicationexam;

public interface ApplicationexamService {

    public Applicationexam saveOrUpdate(Applicationexam applicationexam);

    public List<Applicationexam> findAllApplicationexam();

    public void delete(Integer id);

    public Applicationexam findApplicationexamById(Integer id);
}
