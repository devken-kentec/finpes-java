package br.com.kentec.finpes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.finpes.domain.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long>{

}
