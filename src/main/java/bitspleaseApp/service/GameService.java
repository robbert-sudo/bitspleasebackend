package bitspleaseApp.service;

import bitspleaseApp.dto.request.GamePatchRequest;
import bitspleaseApp.model.Game;

import java.util.Optional;

public interface GameService {


    Optional<Game> save(Game game);

    Iterable<Game> findAll();

    Iterable<Game> findByName(String name);

    void deleteById(long id);

    Optional<Game> updateGame(long id, Game game);

    Iterable<Game> findBySystem(String system);

    Optional<Game> findById(long id);

    Iterable<Game> findBySystemAndNameContains(String system, String name);

    Iterable<Game> findAllByUploader(long uploader);

    void patchGame(long id, GamePatchRequest gamePatchRequest);
}
