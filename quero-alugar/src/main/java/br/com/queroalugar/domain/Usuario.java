package br.com.queroalugar.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ID_USUARIO")
	private Long id;

	private String nomeUsuario;

	@NotNull(message = "Preenchimento obrigatório")
	private String email;

	@NotNull(message = "Preenchimento obrigatório")
	private String senha;

	@ManyToOne
	@JoinColumn(name = "id_locatario")
	private Locatario locatario;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_locador")
	private Locador locador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nome) {
		this.nomeUsuario = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario() {
	}

	public Usuario(String nome,
				   @NotNull(message = "Preenchimento obrigatório") String email,
				   @NotNull(message = "Preenchimento obrigatório") String senha) {

		this.nomeUsuario = nome;
		this.email = email;
		this.senha = senha;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public Locador getLocador() {
		return locador;
	}

	public void setLocador(Locador locador) {
		this.locador = locador;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id=" + id +
				", nome='" + nomeUsuario + '\'' +
				", email='" + email + '\'' +
				", senha='" + senha + '\'' +
				", locatario=" + locatario +
				", locador=" + locador +
				'}';
	}
}
