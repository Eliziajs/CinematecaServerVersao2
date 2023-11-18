package br.com.appcinemateca.api.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "curtida")
public class Curtida implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "quantidade")
    private Long quantidade;
    @Column(name = "status")
    private Boolean status = false;
    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data")
    private Date data = new Date();

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    public Curtida() {
    }

    public Curtida(Long id, Long quantidade, Boolean status, Date data, User user, Filme filme) {
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
        if (!(o instanceof Curtida curtida)) return false;
        return Objects.equals(id, curtida.id) && Objects.equals(quantidade, curtida.quantidade) && Objects.equals(status, curtida.status) && Objects.equals(data, curtida.data) && Objects.equals(user, curtida.user) && Objects.equals(filme, curtida.filme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantidade, status, data, user, filme);
    }
}

