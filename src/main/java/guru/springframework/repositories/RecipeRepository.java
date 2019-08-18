package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by htanyeri on 8/18/2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
