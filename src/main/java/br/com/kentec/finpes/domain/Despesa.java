package br.com.kentec.finpes.domain;

import java.io.Serializable;

import br.com.kentec.finpes.emum.StatusEmum;
import br.com.kentec.finpes.emum.TipoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="despesa")
@SuppressWarnings("serial")
public class Despesa implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="descricao", nullable = false, length = 32)
	private String descricao;
	
	@Column(name="tipo", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoEnum tipo;
	
	@Column(name="status", nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusEmum status;
	
	public Despesa() {
		
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

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	public StatusEmum getStatus() {
		return status;
	}

	public void setStatus(StatusEmum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Despesa [id=" + id + ", descricao=" + descricao + ", tipo=" + tipo + ", status=" + status + "]";
	}
}
