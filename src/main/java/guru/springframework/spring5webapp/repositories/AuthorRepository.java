package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
