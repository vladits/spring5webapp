package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vladi on 07/08/2022
 **/
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
