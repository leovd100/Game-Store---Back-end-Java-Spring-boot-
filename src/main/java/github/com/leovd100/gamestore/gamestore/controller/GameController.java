package github.com.leovd100.gamestore.gamestore.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import github.com.leovd100.gamestore.gamestore.dto.CardGameDto;
import github.com.leovd100.gamestore.gamestore.dto.GameEntityDto;
import github.com.leovd100.gamestore.gamestore.service.GamesService;
import github.com.leovd100.gamestore.gamestore.service.impl.GameServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.repository.GameStoreRepository;

@RestController
@RequestMapping(value = "/games")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GameController {

	private final GameServiceImpl gameService;

	@GetMapping
	public ResponseEntity<List<CardGameDto>> findAll() {
		return ResponseEntity.ok(gameService.findAllGames());
	}

	@GetMapping(value = "filter/{id}")
	public ResponseEntity<GameEntityDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(gameService.findGameById(id));
	}
	
	
	@GetMapping(value = "/filter")
	public ResponseEntity<List<CardGameDto>> findByGameName(@RequestParam("name") String name){
		return ResponseEntity.ok(gameService.findGameByName(name));
	}
	
	///http://localhost:8081/games/filter/sessao?id=2
	
	@GetMapping(value = "/filter/sessao")
	public ResponseEntity<List<CardGameDto>> findBySessionId(@RequestParam("id") Integer id){
		return ResponseEntity.ok(gameService.findGamesBySession(id));
	}
	
}
