package br.com.appcinemateca.api.dto;

import br.com.appcinemateca.api.domain.Filme;
import br.com.appcinemateca.api.domain.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class PostDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private Long id;

	private String mensagem;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date data = new Date();

	private int tipoMsg;
	private Boolean status = false;

	private User user;
	private Filme filme;

	public PostDTO() {
		
	}

	public PostDTO(Long id, String mensagem, Date data, int tipoMsg, Boolean status) {
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
		PostDTO other = (PostDTO) obj;
		return Objects.equals(id, other.id);
	}

}
