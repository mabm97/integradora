package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Users;

public interface UsersService {

    public Users saveOrUpdate(Users users);

    public List<Users> findAllUsers();

    public void delete(Integer id);

    public Users findUsersById(Integer id);
}
