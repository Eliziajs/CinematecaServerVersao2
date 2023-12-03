package br.com.appcinemateca.api.dto;

import br.com.appcinemateca.api.domain.Filme;
import br.com.appcinemateca.api.domain.Personagem;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.*;


public class AtorDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String nome;

    //@JsonIgnore
    private List<Filme> filmes = new ArrayList<>();
    //@JsonIgnore
    private Set<Personagem> personagem = new HashSet<>();
    public AtorDTO() {

    }

    public AtorDTO(Long id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
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
    public Set<Personagem> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Set<Personagem> personagem) {
        this.personagem = personagem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        AtorDTO other = (AtorDTO) obj;
        return Objects.equals(id, other.id);
    }

}
