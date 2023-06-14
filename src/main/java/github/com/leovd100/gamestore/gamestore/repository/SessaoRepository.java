package github.com.leovd100.gamestore.gamestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.leovd100.gamestore.gamestore.entities.SessionEntity;

@Repository
public interface SessaoRepository extends JpaRepository<SessionEntity, Long> {
	
}
