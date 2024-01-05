package br.com.kentec.finpes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.finpes.domain.User;
import br.com.kentec.finpes.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;
	
	public void gravarUser(User user) {
		ur.save(user);
	}
	
	public void alterarUser(User user) {
		ur.save(user);
	}

}
