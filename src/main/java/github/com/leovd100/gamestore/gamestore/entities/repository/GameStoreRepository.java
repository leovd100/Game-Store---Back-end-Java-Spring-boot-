package github.com.leovd100.gamestore.gamestore.entities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;

@Repository
public interface GameStoreRepository extends  JpaRepository<GameEntity,Long>  {
	
	List<GameEntity> findByNomeContains(String nome);
}
