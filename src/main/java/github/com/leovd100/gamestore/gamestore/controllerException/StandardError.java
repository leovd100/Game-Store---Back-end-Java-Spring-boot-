package github.com.leovd100.gamestore.gamestore.controllerException;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
    private String message;

    public static StandardError builder(){
        return new StandardError();
    }

    public StandardError timestamp(Instant time){
        this.timestamp = time;
        return this;
    }

    public StandardError status (Integer status){
        this.status = status;
        return this;
    }

    public StandardError error (String error){
        this.error = error;
        return this;
    }

    public StandardError path (String path){
        this.path = path;
        return this;
    }

    public StandardError messagem(String msg){
        this.message = msg;
        return this;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }

    public String getMessage() {
        return message;
    }
}
