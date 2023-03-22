package github.com.leovd100.gamestore.gamestore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.leovd100.gamestore.gamestore.entities.VideoEntity;
import github.com.leovd100.gamestore.gamestore.repository.VideoRepository;

@RestController
@RequestMapping(value = "/video")
public class VideoController{

	@Autowired
	private VideoRepository videoRepository;
	
	@GetMapping
	public ResponseEntity<List<VideoEntity>> findAll(){ 
		List<VideoEntity> listaVideos = videoRepository.findAll();
		return ResponseEntity.ok(listaVideos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VideoEntity> findById(@PathVariable Long id){
		Optional<VideoEntity> obj = videoRepository.findById(id);
		return ResponseEntity.ok(obj.get());
	}
	
}
