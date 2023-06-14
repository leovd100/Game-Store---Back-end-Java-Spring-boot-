package github.com.leovd100.gamestore.gamestore.dto;

import github.com.leovd100.gamestore.gamestore.entities.GameEntity;

public class CardGameDto {
    private Long id;
    private String nome;
    private String imagem;
    private Double preco;
    private Integer sessao;

    public CardGameDto(){}

    public CardGameDto(Long id, String nome, String imagem, Double preco, Integer sessao) {
        this.id = id;
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
        this.sessao = sessao;
    }

    public CardGameDto(GameEntity entity){
        this(entity.getId(),entity.getNome(),entity.getImagem(),entity.getPreco(),entity.getSessao());
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

    public Integer getSessao() {
        return sessao;
    }

    public void setSessao(Integer sessao) {
        this.sessao = sessao;
    }
}
