package github.com.leovd100.gamestore.gamestore.repsitory;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.exception.VideoException;
import github.com.leovd100.gamestore.gamestore.repository.GameStoreRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@DataJpaTest
public class GamesStoreRepositoryTests {
    @Autowired
    GameStoreRepository repository;

    @Test
    public void findShouldGetAllGamesInDataBase(){
        List<GameEntity> entity = repository.findAll();
        Assertions.assertFalse(entity.isEmpty());
    }

    @Test
    public void findByIdShouldReturnAGameWhenInsertAValidId(){
        Long id = 5L;
        Optional<GameEntity> gameEntity = repository.findById(id);

        Assertions.assertEquals(id,gameEntity.get().getId() );
        Assertions.assertFalse(gameEntity.isEmpty());
    }

    @Test
    public void findByIdShouldThrowExceptionWhenInsertAInvalidId(){

        Assertions.assertThrows(NoSuchElementException.class, () -> {
            Long id = 1000L;
            Optional<GameEntity> gameEntity = repository.findById(id);
            gameEntity.get();
        });

    }

}
