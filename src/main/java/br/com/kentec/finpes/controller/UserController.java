package br.com.kentec.finpes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.finpes.domain.User;
import br.com.kentec.finpes.service.UserService;


@RestController
@RequestMapping("/finpes/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void gravarUser(@RequestBody User user) {
		us.gravarUser(user);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void alterarUser(@RequestBody User user) {
		us.alterarUser(user);
	}

}
