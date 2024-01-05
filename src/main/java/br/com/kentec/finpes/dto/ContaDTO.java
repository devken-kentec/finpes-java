package br.com.kentec.finpes.dto;

public class ContaDTO {
	
	private Long id;
	private String descricao;
	private Long userId;
	private String status;
	
	public ContaDTO() {}

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContaDTO [id=" + id + ", descricao=" + descricao + ", userId=" + userId + ", status=" + status + "]";
	}
}
