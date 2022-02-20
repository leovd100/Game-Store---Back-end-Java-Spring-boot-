package github.com.leovd100.gamestore.gamestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "sessao")
public class SessaoEntity {
	
	
	//select g.nome, g.preco, s.sessao from games as g inner join sessao as s on g.secao_id = s.id  
	//select g.nome, g.preco, s.sessao from games as g inner join sessao as s on g.secao_id = s.id where s.id = 2   puxa do play
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "sessao")
	private String sessao;
}
