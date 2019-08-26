package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by htanyeri on 8/25/2019.
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
