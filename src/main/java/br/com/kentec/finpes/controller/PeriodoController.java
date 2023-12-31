package br.com.kentec.finpes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.finpes.domain.Periodo;
import br.com.kentec.finpes.service.PeriodoService;

@RestController
@RequestMapping("/finpes/api/v1/periodo")
public class PeriodoController {
	
	@Autowired
	private PeriodoService ps;
	
	@GetMapping("/list/periodo")
	public ResponseEntity<Iterable<Periodo>> listarPeriodo() {
		return ResponseEntity.ok(ps.listarPeriodo());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void gravarPeriodo(@RequestBody Periodo periodo) {
		ps.gravarPeriodo(periodo);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void alterarPeriodo(@RequestBody Periodo periodo) {
		ps.alterarPeriodo(periodo);
	}
}
