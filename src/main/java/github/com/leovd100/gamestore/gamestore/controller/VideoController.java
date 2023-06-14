package github.com.leovd100.gamestore.gamestore.controller;

import java.util.List;
import java.util.Optional;

import github.com.leovd100.gamestore.gamestore.service.impl.VideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import github.com.leovd100.gamestore.gamestore.entities.VideoEntity;
import github.com.leovd100.gamestore.gamestore.repository.VideoRepository;

@RestController
@RequestMapping(value = "/video")
@CrossOrigin("*")
public class VideoController{


	@Autowired
	private VideoServiceImpl videoService;

	@GetMapping
	public ResponseEntity<List<VideoEntity>> findAll(){
		return ResponseEntity.ok(videoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VideoEntity> findById(@PathVariable Long id){
		return ResponseEntity.ok(videoService.findById(id));
	}
	
}
