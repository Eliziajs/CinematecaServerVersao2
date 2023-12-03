package br.com.appcinemateca.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.domain.Post;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import org.springframework.hateoas.RepresentationModel;


public class UserDTO extends RepresentationModel<UserDTO> implements Serializable {
	private static final long serialVersionUID = 1l;


	private Long id;

	private String userName;

	private String password;

	private String email;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date data = new Date();
	@JsonIgnore
	private List<Curtida> curtidas = new ArrayList<>();
	@JsonIgnore
	private List<Post> post = new ArrayList<>();


	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String userName, String email, String password, Date data) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@JsonIgnore
	public List<Curtida> getCurtidas() {
		return curtidas;
	}

	@JsonIgnore
	public void setCurtidas(List<Curtida> curtidas) {
		this.curtidas = curtidas;
	}

	@JsonIgnore
	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserDTO userDTO)) return false;
		if (!super.equals(o)) return false;
		return Objects.equals(id, userDTO.id) && Objects.equals(userName, userDTO.userName) && Objects.equals(password, userDTO.password) && Objects.equals(email, userDTO.email) && Objects.equals(curtidas, userDTO.curtidas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), id, userName, password, email, curtidas);
	}
}
