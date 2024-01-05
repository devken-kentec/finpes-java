package br.com.kentec.finpes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kentec.finpes.domain.Periodo;

import br.com.kentec.finpes.repository.PeriodoRepository;


@Service
public class PeriodoService {
	
	@Autowired
	private PeriodoRepository pr;
	
	public Iterable<Periodo> listarPeriodo() {
		return pr.findAll();
	}
	
	public void gravarPeriodo(Periodo periodo) {
		pr.save(periodo);
	}
	
	public void alterarPeriodo(Periodo periodo) {
		pr.save(periodo);
	}
}
