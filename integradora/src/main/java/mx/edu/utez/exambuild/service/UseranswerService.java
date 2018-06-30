package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Useranswer;

public interface UseranswerService {

    public Useranswer saveOrUpdate(Useranswer useranswer);

    public List<Useranswer> findAllUseranswer();

    public void delete(Integer id);

    public Useranswer findUseransweryId(Integer id);
}
