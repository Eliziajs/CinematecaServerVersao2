package br.com.appcinemateca.api.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "post")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "mensagem")
	private String mensagem;

	@Column(name = "data",updatable = false)
	private Date data = new Date();
	@Column(name = "tipoMsg")
	private int tipoMsg;

	@Column(name = "status")
	private Boolean status = false;

	public int getTipoMsg() {
		return tipoMsg;
	}

	public void setTipoMsg(int tipoMsg) {
		this.tipoMsg = tipoMsg;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_post;

	@ManyToOne
	@JoinColumn(name = "filme_id")
	private Filme filme;

	public Post() {
		
	}

	public Post(Long id, String mensagem, Date data, int tipoMsg, Boolean status) {
		this.id = id;
		this.mensagem = mensagem;
		this.data = data;
		this.tipoMsg = tipoMsg;
		this.status = status;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String Mensagem) {
		this.mensagem = Mensagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	/*public TipoMensagem getTipoMsg() {
		return TipoMensagem.toEnum(tipoMsg);
	}*/

	public User getUser_post() {
		return user_post;
	}

	public void setUser_post(User user) {
		this.user_post = user;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
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
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

}
