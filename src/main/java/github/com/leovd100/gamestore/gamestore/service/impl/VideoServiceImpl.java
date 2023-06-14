package github.com.leovd100.gamestore.gamestore.service.impl;

import github.com.leovd100.gamestore.gamestore.entities.VideoEntity;

import java.util.List;
import java.util.Optional;

public interface VideoServiceImpl {

    List<VideoEntity> findAll();

    VideoEntity findById(Long id);
}
