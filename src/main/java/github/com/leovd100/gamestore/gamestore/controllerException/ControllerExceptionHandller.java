package github.com.leovd100.gamestore.gamestore.controllerException;

import github.com.leovd100.gamestore.gamestore.exception.GameException;
import github.com.leovd100.gamestore.gamestore.exception.VideoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandller {

    @ExceptionHandler(GameException.class)
    public ResponseEntity<StandardError> entityNotFound(GameException entity, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standard = StandardError.builder()
                .error("Resource not found")
                .messagem(entity.getMessage())
                .status(status.value())
                .path(request.getRequestURI())
                .timestamp(Instant.now());
        return ResponseEntity.status(status).body(standard);
    }

    @ExceptionHandler(VideoException.class)
    public ResponseEntity<StandardError> videoNotFound(VideoException entity, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standard = StandardError.builder()
                .error("Resource not found")
                .messagem(entity.getMessage())
                .status(status.value())
                .path(request.getRequestURI())
                .timestamp(Instant.now());
        return ResponseEntity.status(status).body(standard);
    }

}
