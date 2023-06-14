package github.com.leovd100.gamestore.gamestore.service.check;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import github.com.leovd100.gamestore.gamestore.entities.errorEntity.ErrorMapperObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class CheckGameResponse {
    public ResponseEntity<?>  checkGameOption (Optional<?> gameOption){
        if(gameOption.isEmpty()){
            return ResponseEntity.ok(errorObjectFactory(HttpStatus.NOT_FOUND.toString(), "Game não encontrado na base de dados"));

        }else{
            return ResponseEntity.ok(gameOption.get());
        }
    }

    public ErrorMapperObject errorObjectFactory(String status, String message){
        return new ErrorMapperObject(status, message);
    }
}
