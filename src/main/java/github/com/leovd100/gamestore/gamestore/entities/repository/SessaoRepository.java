package github.com.leovd100.gamestore.gamestore.entities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.entities.SessaoEntity;

@Repository
public interface SessaoRepository extends JpaRepository<SessaoEntity, Long> {
	
}
