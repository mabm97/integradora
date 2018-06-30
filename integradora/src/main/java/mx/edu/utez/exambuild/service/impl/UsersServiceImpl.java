package mx.edu.utez.exambuild.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.exambuild.entity.Users;
import mx.edu.utez.exambuild.respository.UsersRepository;
import mx.edu.utez.exambuild.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository UsersRepository;

    @Override
    public Users saveOrUpdate(Users users) {
        return UsersRepository.save(users);
    }

    @Override
    public List<Users> findAllUsers() {
        return UsersRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Users users = new Users();
        users.setId(id);
        UsersRepository.delete(users);
    }

    @Override
    public Users findUsersById(Integer id) {
        return UsersRepository.findUsersById(id);
    }

}
