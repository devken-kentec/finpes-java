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
@Table(name="lancamento_receita")
@SuppressWarnings("serial")
public class LancamentoReceita implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="dia_recebimento", nullable = false, length = 2)
	private Integer diaRecebimento;
	
	@Column(name="data_recebimento", nullable = false, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataRecebimento;
	
	@Column(name="valor_parcela", nullable = false, precision = 10, scale = 2)
	private BigDecimal valorParcela;
	
	@Column(name="parcelas", nullable = false, length = 2)
	private Integer parcelas;
	
	@Column(name="status_recebimento", nullable = false, length = 32)
	private String statusRecebimento;
	
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
	@JoinColumn(name = "id_receita", nullable = false)
	private Receita receita = new Receita();
	
	@Column(name="valor_total", nullable = false, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	public LancamentoReceita() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDiaRecebimento() {
		return diaRecebimento;
	}

	public void setDiaRecebimento(Integer diaRecebimento) {
		this.diaRecebimento = diaRecebimento;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
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

	public String getStatusRecebimento() {
		return statusRecebimento;
	}

	public void setStatusRecebimento(String statusRecebimento) {
		this.statusRecebimento = statusRecebimento;
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

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "LancamentoReceita [id=" + id + ", diaRecebimento=" + diaRecebimento + ", dataRecebimento="
				+ dataRecebimento + ", valorParcela=" + valorParcela + ", parcelas=" + parcelas + ", statusRecebimento="
				+ statusRecebimento + ", status=" + status + ", conta=" + conta + ", periodo=" + periodo + ", receita="
				+ receita + ", valorTotal=" + valorTotal + "]";
	}
}
