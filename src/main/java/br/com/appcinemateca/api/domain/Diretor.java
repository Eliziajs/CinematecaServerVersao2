package br.com.appcinemateca.api.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "diretor")
public class Diretor implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;

	@JsonBackReference
	@OneToMany(mappedBy = "diretor")
	List<Filme> filme = new ArrayList<>();

	public Diretor() {
	}
	public Diretor(Long id, String nome) {
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
	public List<Filme> getFilmes() {
		return filme;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filme = filmes;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Diretor diretor)) return false;
		return Objects.equals(id, diretor.id) && Objects.equals(nome, diretor.nome) && Objects.equals(filme, diretor.filme);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, filme);
	}
}
