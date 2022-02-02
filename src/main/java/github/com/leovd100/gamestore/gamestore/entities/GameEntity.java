package github.com.leovd100.gamestore.gamestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "games")
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

	@Column(name = "secao_id")
	private Integer secao;
	
	
	public GameEntity() {
	}
	
	public GameEntity(Long id, String nome, String imagem, Double preco, Integer secao) {
		
		this.id = id;
		this.nome = nome;
		this.imagem = imagem;
		this.preco = preco;
		this.secao = secao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getSecao() {
		return secao;
	}

	public void setSecao(Integer secao) {
		this.secao = secao;
	}
	
	
	
}
