package bitspleaseApp.repository;

import bitspleaseApp.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

    Iterable<Game> findByNameContains(String name);

    Iterable<Game> findBySystem(String system);

    Iterable<Game> findBySystemAndNameContains(String system, String name);

}
