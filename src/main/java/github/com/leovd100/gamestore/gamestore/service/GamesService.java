package github.com.leovd100.gamestore.gamestore.service;

import github.com.leovd100.gamestore.gamestore.Exception.GameException;
import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.repository.GameStoreRepository;
import github.com.leovd100.gamestore.gamestore.service.impl.GameServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesService implements GameServiceImpl {

    private final GameStoreRepository gameStoreRepository;
    private CheckGameResponse gameCheck = new CheckGameResponse();
    public GamesService(GameStoreRepository gameRepository){
        this.gameStoreRepository = gameRepository;
    }

    @Override
    public List<GameEntity> findAllGames() {
        try {
            return gameStoreRepository.findAll();
        }catch (Exception ex){
            ex.getMessage();
            throw new GameException("Nenhum jogo encontrado");
        }
    }

    @Override
    public Object  findGameById(Long id) {
        try {
            Optional<?> game = gameStoreRepository.findById(id);
            return gameCheck.checkGameOption(game);
        }catch (Exception ex){
            ex.getMessage();
            throw new GameException("Nenhum jogo encontrado");
        }
    }

    @Override
    public List<GameEntity> findGameByName(String name) {
        try {
            return gameStoreRepository.findByNomeContainsIgnoreCase(name);
        }catch (Exception ex){
            ex.getMessage();
            throw new GameException("Nenhum jogo encontrado");
        }
    }

    @Override
    public List<GameEntity> findGamesBySession(Integer id) {
        try {
            return gameStoreRepository.findBySessao(id);
        }catch (Exception ex){
            ex.getMessage();
            throw new GameException("Nenhum jogo encontrado");
        }
    }
}
