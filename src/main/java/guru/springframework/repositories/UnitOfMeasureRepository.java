package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by htanyeri on 8/18/2019.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
