package guru.springframework.spring5webapp.repostory;
import guru.springframework.spring5webapp.model.Publish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepostrory extends JpaRepository<Publish, Long> {
}
