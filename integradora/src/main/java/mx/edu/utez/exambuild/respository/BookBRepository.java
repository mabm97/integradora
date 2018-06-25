package mx.edu.utez.exambuild.respository;

import mx.edu.utez.exambuild.entity.BookB;
import org.springframework.data.jpa.repository.JpaRepository;




public interface BookBRepository extends JpaRepository<BookB, Long>{
	public BookB findBookBById(Integer id);

}

