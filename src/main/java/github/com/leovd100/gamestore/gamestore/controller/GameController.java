package github.com.leovd100.gamestore.gamestore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.entities.repository.GameStoreRepository;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameStoreRepository gameStoreRepository;
	
	@GetMapping
	public List<GameEntity> findAll() {
		List<GameEntity> result = gameStoreRepository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "filter/{id}")
	public GameEntity findById(@PathVariable Long id) {
			Optional<GameEntity>  objVideo = gameStoreRepository.findById(id);
			return objVideo.get();
	}
	
	
	@GetMapping(value = "/filter")
	public ResponseEntity<List<GameEntity>> findByGameName(@RequestParam("name") String name){
		List<GameEntity> filtedList = gameStoreRepository.findByNomeContainsIgnoreCase(name);
		return ResponseEntity.ok(filtedList);
	}
	
	///http://localhost:8081/games/filter/sessao?id=2
	
	@GetMapping(value = "/filter/sessao")
	public ResponseEntity<List<GameEntity>> findBySessionId(@RequestParam("id") Integer id){ 
		List<GameEntity> teste = gameStoreRepository.findBySecao(id);
		return ResponseEntity.ok(teste);
	}
	
}
