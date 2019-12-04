package com.curso.escuela.ApiAFIP;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImpuestoRepository extends JpaRepository<Impuestos,Long>{
	
	List<Impuestos> findAllByNmroFiscal(Long nrmo);
	List<Impuestos> findByCreatedDateBetween(Date start, Date end);
	Impuestos findByTipoLike(String tipo);
	
}
