package mx.edu.utez.exambuild.respository;

import mx.edu.utez.exambuild.entity.Alumn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnRepository extends JpaRepository<Alumn, Long> {

    public Alumn findAlumnById(Integer id);

}
