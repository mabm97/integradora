package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Type;

public interface TypeService {

    public Type saveOrUpdate(Type type);

    public List<Type> findAllType();

    public void delete(Integer id);

    public Type findTypeById(Integer id);
}
