package mx.edu.utez.exambuild.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.exambuild.entity.BookB;
import mx.edu.utez.exambuild.respository.BookBRepository;
import mx.edu.utez.exambuild.service.BookBService;

@Service
@Transactional
public class BookBServiceImpl implements BookBService{

	@Autowired
	private BookBRepository bookBRepository;

	@Override
	public BookB saveOrUpdate(BookB bookB) {
		// TODO Auto-generated method stub
		return bookBRepository.save(bookB);
	}

	@Override
	public List<BookB> findAllBookB() {
		// TODO Auto-generated method stub
		return bookBRepository.findAll();
	}

	@Override
	public void delete(Integer id) {
		BookB bookB = new BookB();
		bookB.setId(id);
		bookBRepository.delete(bookB);		
	}

	@Override
	public BookB findBookById(Integer id) {
		return bookBRepository.findBookBById(id);
	}



}
