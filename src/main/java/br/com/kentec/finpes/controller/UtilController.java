package br.com.kentec.finpes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.kentec.finpes.emum.StatusEmum;
import br.com.kentec.finpes.service.UtilService;

@RestController
@RequestMapping("/finpes/api/v1/utils")
public class UtilController {
	
	@Autowired
	private UtilService us;
	
	@GetMapping("/opt/status")
	public ResponseEntity<List<StatusEmum>> selectStatus() {
		return ResponseEntity.ok(us.selectEnumStatus());
	}
}
