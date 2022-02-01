package github.com.leovd100.gamestore.gamestore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.leovd100.gamestore.gamestore.entities.ObjectVideo;
import github.com.leovd100.gamestore.gamestore.entities.repository.GameStoreRepository;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameStoreRepository gameStoreRepository;
	
	@GetMapping(value = "")
	public List<ObjectVideo> findAll() {
		List<ObjectVideo> result = gameStoreRepository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{id}")
	public ObjectVideo findById(@PathVariable Long id) {
			Optional<ObjectVideo>  objVideo = gameStoreRepository.findById(id);
			return objVideo.get();
	}
	
	
}
