package guru.springframework.spring5webapp.repostory;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepostory extends JpaRepository<Book, Long> {
}
