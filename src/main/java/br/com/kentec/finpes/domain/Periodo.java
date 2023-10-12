package br.com.kentec.finpes.domain;

import java.io.Serializable;
import br.com.kentec.finpes.emum.StatusEmum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="periodo")
@SuppressWarnings("serial")
public class Periodo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="referencia", unique=true, nullable = false, length = 7)
	private String referencia;
	
	@Column(name="status", nullable = false)
	private StatusEmum status;
	
	public Periodo () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public StatusEmum getStatus() {
		return status;
	}

	public void setStatus(StatusEmum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Periodo [id=" + id + ", referencia=" + referencia + ", status=" + status + "]";
	}
}
