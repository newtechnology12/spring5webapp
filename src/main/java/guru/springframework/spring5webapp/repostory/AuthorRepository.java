package guru.springframework.spring5webapp.repostory;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {
}
