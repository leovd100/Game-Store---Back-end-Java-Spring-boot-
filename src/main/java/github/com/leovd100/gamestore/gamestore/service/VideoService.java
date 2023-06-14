package github.com.leovd100.gamestore.gamestore.service;

import github.com.leovd100.gamestore.gamestore.entities.VideoEntity;
import github.com.leovd100.gamestore.gamestore.exception.VideoException;
import github.com.leovd100.gamestore.gamestore.repository.VideoRepository;
import github.com.leovd100.gamestore.gamestore.service.impl.VideoServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class VideoService implements VideoServiceImpl {

    private final VideoRepository repository;

    public VideoService(VideoRepository videoRepository){
        this.repository = videoRepository;
    }

    @Override
    public List<VideoEntity> findAll() {
        List<VideoEntity> entities = repository.findAll();
        if(entities.isEmpty()){
            throw new VideoException("Nenhum conteúdo encontrado");
        }
        return entities;
    }

    @Override
    public VideoEntity findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new VideoException("Nenhum conteúdo encontrado"));
    }
}
