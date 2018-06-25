package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.BookB;




public interface BookBService {

	public BookB saveOrUpdate(BookB bookB);
	public List<BookB> findAllBookB();
	public void delete(Integer id);
	public BookB findBookById(Integer id); 
}
