package br.com.kentec.finpes.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import br.com.kentec.finpes.emum.StatusEmum;

@Service
public class UtilService {
	
	public List<StatusEmum> selectEnumStatus() {
		List<StatusEmum> listaStatus = new ArrayList<>();
		 Arrays.asList(StatusEmum.values()).forEach(
				s -> listaStatus.add(s));
		return listaStatus;
	}
}
