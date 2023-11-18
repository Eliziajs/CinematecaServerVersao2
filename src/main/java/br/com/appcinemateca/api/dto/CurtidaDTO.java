package br.com.appcinemateca.api.dto;

//Avaliar o tipo de dado long para o atributo qtd

import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.domain.Filme;
import br.com.appcinemateca.api.domain.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class CurtidaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long quantidade;
    private Boolean status = false;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date data = new Date();

    @JsonIgnore
    private User user;

    @JsonIgnore
    private Filme filme;
    public CurtidaDTO() {
    }

    public CurtidaDTO(Long id, Long quantidade, Boolean status, Date data, User user, Filme filme) {
        this.id = id;
        this.quantidade = quantidade;
        this.status = status;
        this.data = data;
        this.user = user;
        this.filme = filme;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurtidaDTO that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(quantidade, that.quantidade) && Objects.equals(status, that.status) && Objects.equals(data, that.data) && Objects.equals(user, that.user) && Objects.equals(filme, that.filme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantidade, status, data, user, filme);
    }
}

