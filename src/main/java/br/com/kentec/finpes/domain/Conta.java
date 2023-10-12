package br.com.kentec.finpes.domain;

import java.io.Serializable;

import br.com.kentec.finpes.emum.StatusEmum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="conta")
@SuppressWarnings("serial")
public class Conta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 32)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user = new User();
	
	@Column(name="status", nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusEmum status;
	
	public Conta() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StatusEmum getStatus() {
		return status;
	}

	public void setStatus(StatusEmum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", descricao=" + descricao + ", user=" + user + ", status=" + status + "]";
	}
}
