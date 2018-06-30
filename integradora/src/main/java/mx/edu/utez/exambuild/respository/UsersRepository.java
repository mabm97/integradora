package mx.edu.utez.exambuild.respository;

import mx.edu.utez.exambuild.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    public Users findUsersById(Integer id);

}
