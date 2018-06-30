package mx.edu.utez.exambuild.controller;
//

import java.util.List;
import mx.edu.utez.exambuild.entity.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.exambuild.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("findAll")
    public List<Users> findAll() {
        return usersService.findAllUsers();
    }

    @PostMapping("register")
    public Users save(@RequestBody Users users) {
        return usersService.saveOrUpdate(users);
    }

    @PutMapping("{id}")
    public Users update(@PathVariable Integer id, @RequestBody Users users) {
        users.setId(id);
        return usersService.saveOrUpdate(users);
    }

    @GetMapping("{id}")
    public Users getUsers(@PathVariable Integer id) {
        return usersService.findUsersById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUsers(@PathVariable Integer id) {
        usersService.delete(id);
    }
}
