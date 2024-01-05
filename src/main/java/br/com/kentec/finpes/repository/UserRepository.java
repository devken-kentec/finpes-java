package br.com.kentec.finpes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.finpes.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
