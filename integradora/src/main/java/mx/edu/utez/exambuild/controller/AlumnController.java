package mx.edu.utez.exambuild.controller;
//

import java.util.List;
import mx.edu.utez.exambuild.entity.Alumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.exambuild.service.AlumnService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
@RequestMapping("alumn")
public class AlumnController {

    @Autowired
    private AlumnService alumnService;

    @GetMapping("findAll")
    public List<Alumn> findAll() {
        return alumnService.findAllAlumn();
    }

    @PostMapping("register")
    public Alumn save(@RequestBody Alumn alumn) {
        return alumnService.saveOrUpdate(alumn);
    }

    @PutMapping("{id}")
    public Alumn update(@PathVariable Integer id, @RequestBody Alumn alumn) {
        alumn.setId(id);
        return alumnService.saveOrUpdate(alumn);
    }

    @GetMapping("{id}")
    public Alumn getAlumn(@PathVariable Integer id) {
        return alumnService.findAlumnById(id);
    }

    @DeleteMapping("{id}")
    public void deleteAlumn(@PathVariable Integer id) {
        alumnService.delete(id);
    }
}
