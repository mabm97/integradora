package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Alumn;

public interface AlumnService {

    public Alumn saveOrUpdate(Alumn alumn);

    public List<Alumn> findAllAlumn();

    public void delete(Integer id);

    public Alumn findAlumnById(Integer id);
}
