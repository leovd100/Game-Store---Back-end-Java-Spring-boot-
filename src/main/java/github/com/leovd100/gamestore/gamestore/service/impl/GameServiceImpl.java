package github.com.leovd100.gamestore.gamestore.service.impl;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface GameServiceImpl {

    public List<GameEntity> findAllGames();

    public Object findGameById(Long id);

    public  List<GameEntity> findGameByName(String name);

    public List<GameEntity> findGamesBySession(Integer id);
}
