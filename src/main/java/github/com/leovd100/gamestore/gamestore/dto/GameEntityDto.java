package github.com.leovd100.gamestore.gamestore.dto;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Lob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameEntityDto {
    private Long id;
    private String nome;
    private String imagem;
    private Double preco;
    private Integer sessao;
    private String descricao;

    public GameEntityDto(GameEntity entity){
        this(entity.getId(),entity.getNome(), entity.getImagem(), entity.getPreco(), entity.getSessao(), entity.getDescricao());
    }



}
