package br.com.kentec.finpes.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name="lancamento_despesa")
@SuppressWarnings("serial")
public class LancamentoDespesa implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="dia_pagamento", nullable = false, length = 2)
	private Integer diaPagamento;
	
	@Column(name="data_pagamento", nullable = false, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataPagamento;
	
	@Column(name="valor_parcela", nullable = false, precision = 10, scale = 2)
	private BigDecimal valorParcela;
	
	@Column(name="parcelas", nullable = false, length = 2)
	private Integer parcelas;
	
	@Column(name="status_pagamento", nullable = false, length = 32)
	private String statusPagamento;
	
	@Column(name="status", nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusEmum status;
	
	@ManyToOne
	@JoinColumn(name = "id_conta", nullable = false)
	private Conta conta = new Conta();
	
	@ManyToOne
	@JoinColumn(name = "id_perido", nullable = false)
	private Periodo periodo = new Periodo();
	
	@ManyToOne
	@JoinColumn(name = "id_despesa", nullable = false)
	private Despesa despesa = new Despesa();
	
	@Column(name="valor_total", nullable = false, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	public LancamentoDespesa() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDiaPagamento() {
		return diaPagamento;
	}

	public void setDiaPagamento(Integer diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public StatusEmum getStatus() {
		return status;
	}

	public void setStatus(StatusEmum status) {
		this.status = status;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "LancamentoDespesa [id=" + id + ", diaPagamento=" + diaPagamento + ", dataPagamento=" + dataPagamento
				+ ", valorParcela=" + valorParcela + ", parcelas=" + parcelas + ", statusPagamento=" + statusPagamento
				+ ", status=" + status + ", conta=" + conta + ", periodo=" + periodo + ", despesa=" + despesa
				+ ", valorTotal=" + valorTotal + "]";
	}
}
