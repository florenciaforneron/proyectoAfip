package com.cdainfo.afip2.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdainfo.afip2.dominio.Impuesto;


@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Long>{
	
//	    List<Impuesto> findAllByTipoImpuestoLike(String tipoImpuesto);
		List<Impuesto> findAllByFechaBetween(Date fecha1, Date fecha2);
		Impuesto findByTipoImpuesto(String tipoImpuesto);

		


	}	



