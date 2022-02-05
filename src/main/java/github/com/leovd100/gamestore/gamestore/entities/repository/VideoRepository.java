package github.com.leovd100.gamestore.gamestore.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.leovd100.gamestore.gamestore.entities.VideoEntity;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long>{
	
}
