package com.cdainfo.afip2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.afip2.dominio.Contribuyente;

@Repository
public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Long> {
	//List<Contribuyente> findAllByClaveFiscal(Integer claveFiscal);
	Contribuyente findByClaveFiscal(String clave);
}
