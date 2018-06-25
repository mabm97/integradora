package mx.edu.utez.exambuild.controller;
//

import java.util.List;
import mx.edu.utez.exambuild.entity.BookB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.exambuild.service.BookBService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
@RequestMapping("bookB")
public class BookBController {

    @Autowired
    private BookBService bookBService;

    @GetMapping("findAll")
    public List<BookB> findAll() {
        return bookBService.findAllBookB();
    }

    @PostMapping("register")
    public BookB save(@RequestBody BookB bookB) {
        return bookBService.saveOrUpdate(bookB);
    }

    @PutMapping("{id}")
    public BookB update(@PathVariable Integer id, @RequestBody BookB bookB) {
        bookB.setId(id);
        return bookBService.saveOrUpdate(bookB);
    }

    @GetMapping("{id}")
    public BookB getBookB(@PathVariable Integer id) {
        return bookBService.findBookById(id);
    }

    @DeleteMapping("{id}")
    public void deleteBookB(@PathVariable Integer id) {
        bookBService.delete(id);
    }
}
