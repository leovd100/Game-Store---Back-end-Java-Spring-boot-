package github.com.leovd100.gamestore.gamestore.service;

import github.com.leovd100.gamestore.gamestore.exception.GameException;
import github.com.leovd100.gamestore.gamestore.dto.CardGameDto;
import github.com.leovd100.gamestore.gamestore.dto.GameEntityDto;
import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.repository.GameStoreRepository;
import github.com.leovd100.gamestore.gamestore.service.check.CheckGameResponse;
import github.com.leovd100.gamestore.gamestore.service.impl.GameServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GamesService implements GameServiceImpl {

    private final GameStoreRepository gameStoreRepository;
    private CheckGameResponse gameCheck = new CheckGameResponse();
    public GamesService(GameStoreRepository gameRepository){
        this.gameStoreRepository = gameRepository;
    }

    @Override
    public List<CardGameDto> findAllGames() {

            List<CardGameDto> gameList = gameStoreRepository.findAll().stream().map(CardGameDto::new).collect(Collectors.toList());
            if(gameList.isEmpty()){
                throw new GameException("Nenhum jogo encontrado");
            }
            return gameList;


    }

    @Override
    public GameEntityDto findGameById(Long id) {
            GameEntity game = gameStoreRepository.findById(id).orElseThrow(() -> new GameException("Nenhum jogo encontrado"));
            return new GameEntityDto(game);
    }

    @Override
    public List<CardGameDto> findGameByName(String name) {
            List<GameEntity> listGames = gameStoreRepository.findByNomeContainsIgnoreCase(name);
            if(listGames.isEmpty()){
                throw new GameException("Nenhum jogo encontrado");
            }
            return listGames.stream().map(CardGameDto::new).collect(Collectors.toList());
    }

    @Override
    public List<CardGameDto> findGamesBySession(Integer id) {

            List<CardGameDto> listGames = gameStoreRepository.findBySessao(id).stream().map(CardGameDto::new).collect(Collectors.toList());
            if(listGames.isEmpty()) {
                throw new GameException("Nenhum jogo encontrado");
            }
            return listGames;

    }
}
