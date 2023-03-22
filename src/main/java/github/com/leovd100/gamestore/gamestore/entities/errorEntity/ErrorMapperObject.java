package github.com.leovd100.gamestore.gamestore.entities.errorEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@NoArgsConstructor
public class ErrorMapperObject {

    private String status;
    private String message;

    public ErrorMapperObject(String status, String message){
        this.status = status;
        this.message = message;
    }

}
