package br.com.fiap.Shows.dto;

import br.com.fiap.Shows.entity.Cidade;

public class CidadeDTO {

    private Integer id;
    private String name;
    private String imageUrl;

    public CidadeDTO() {}

    public CidadeDTO(Cidade cidade) {
        this.id = cidade.getId();
        this.name = cidade.getName();
        this.imageUrl = cidade.getImageUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
