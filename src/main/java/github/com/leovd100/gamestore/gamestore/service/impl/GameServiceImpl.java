package github.com.leovd100.gamestore.gamestore.service.impl;

import github.com.leovd100.gamestore.gamestore.dto.CardGameDto;
import github.com.leovd100.gamestore.gamestore.dto.GameEntityDto;
import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface GameServiceImpl {

    public List<CardGameDto> findAllGames();

    public GameEntityDto findGameById(Long id);

    public  List<CardGameDto> findGameByName(String name);

    public List<CardGameDto> findGamesBySession(Integer id);
}
