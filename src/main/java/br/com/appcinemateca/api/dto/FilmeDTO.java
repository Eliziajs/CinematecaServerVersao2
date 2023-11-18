//muitos p um o proprio contrutor faz a associação do muitos p um

package br.com.appcinemateca.api.dto;

import br.com.appcinemateca.api.domain.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.*;

public class FilmeDTO implements Serializable {
	private static final long serialVersionUID = 1l;

	private Long id;
	private String titulo;
	private Integer ano;
	private String sinopse;
	@JsonFormat(pattern = "dd-MM-yyyy" )/*HH:mm:ss",timezone = "GMT-3"*/
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private Date data = new Date();


	private GeneroDTO generos;
	private DiretorDTO diretor;

	@JsonIgnore
	private Set<Personagem> personagem = new HashSet<>();

	@JsonIgnore
	private List<Curtida> curtidas = new ArrayList<>();

	@JsonIgnore
	private List<Post> post = new ArrayList<>();


	public FilmeDTO() {

	}

	public FilmeDTO(Long id, String titulo, Integer ano, String sinopse, GeneroDTO generos, DiretorDTO diretor, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.sinopse = sinopse;
		this.generos = generos;
		this.diretor = diretor;
		this.data = data;

	}
	public List<Ator> getAtores() {
		List<Ator> lista = new ArrayList<>();
		for (Personagem p : personagem) {
			lista.add(p.getAtor());
		}
		return lista;
	}

	public void setCurtidas(List<Curtida> curtidas) {
		this.curtidas = curtidas;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public DiretorDTO getDiretor() {
		return diretor;
	}

	public void setDiretores(DiretorDTO diretor) {
		this.diretor = diretor;
	}

	public GeneroDTO getGeneros() {
		return generos;
	}

	public void setGeneros(GeneroDTO generos) {
		this.generos = generos;
	}
	public Set<Personagem> getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Set<Personagem> personagem) {
		this.personagem = personagem;
	}

	public void setDiretor(DiretorDTO diretor) {
		this.diretor = diretor;
	}

	public List<Curtida> getCurtidas() {
		return curtidas;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilmeDTO other = (FilmeDTO) obj;
		return Objects.equals(id, other.id);
	}

}
