package github.com.leovd100.gamestore.gamestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "games")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome; 
	
	@Column(name = "imagem")
	private String imagem; 
	
	@Column(name = "preco")
	private Double preco;

	@Column(name = "sessao_id")
	private Integer sessao;
	
	@Lob
	@Column(name = "descricao")
	private String descricao;
	
	
	
	
}
