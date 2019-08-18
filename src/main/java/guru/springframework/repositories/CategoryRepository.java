package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by htanyeri on 8/18/2019.
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
