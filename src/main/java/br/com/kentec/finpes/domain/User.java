package br.com.kentec.finpes.domain;

import java.io.Serializable;
import java.util.Arrays;

import br.com.kentec.finpes.emum.StatusEmum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="user" )
@SuppressWarnings("serial")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="nome", nullable = false, length = 16)
	private String nome;
	
	@Column(name="sobrenome", nullable = true, length = 32)
	private String sobrenome;
	
	@Column(name="email", unique=true  ,nullable = false, length = 64)
	private String email;
	
	@Column(name="role", nullable = false,  length = 16)
	private String role;
	
	@Column(name="senha", nullable = false, length = 255)
	private String senha;
	
	@Column(name="status", nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusEmum status;
	
	@Column
	@Lob
	private byte[] foto;

	public User() {
	
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public StatusEmum getStatus() {
		return status;
	}

	public void setStatus(StatusEmum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", role=" + role
				+ ", senha=" + senha + ", status=" + status + ", foto=" + Arrays.toString(foto) + "]";
	}
}
