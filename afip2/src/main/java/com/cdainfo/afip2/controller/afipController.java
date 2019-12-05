package com.cdainfo.afip2.controller;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cdainfo.afip2.dominio.Contribuyente;
import com.cdainfo.afip2.dominio.Impuesto;
import com.cdainfo.afip2.repository.ContribuyenteRepository;
import com.cdainfo.afip2.repository.ImpuestoRepository;

@RestController
public class afipController {

	@Autowired
	ImpuestoRepository impuestoRepository;

	@Autowired
	ContribuyenteRepository contribuyenteRepository;

	@GetMapping("/impuesto/search/{claveFiscal}")
	public Contribuyente getContribuyente(@PathVariable String claveFiscal) {
		return contribuyenteRepository.findByClaveFiscal(claveFiscal);
	}

	@GetMapping("/impuesto/searchImpuesto/{tipoImpuesto}")
	public Impuesto getImpuesto(@PathVariable String tipoImpuesto) {
		return impuestoRepository.findByTipoImpuesto(tipoImpuesto);
	}

	/*
	 * Crear las fechas de liquidacion de dichos impuestos pasando las fechas como
	 * parametros a los servicios
	 */
	@PostMapping("/impuesto/add")
	public Impuesto createImpuesto(@RequestBody Impuesto body) {
		return impuestoRepository.save(body);
	}

	/*
	 * Consultar las fechas de liquidacion de los impuestos pasando una fecha desde
	 * hasta una fecha hasta
	 */
	@GetMapping("/impuesto/search2/{fecha1}/{fecha2}")
	public List<Impuesto> getImpuestosByFecha(@PathVariable Date fecha1, @PathVariable Date fecha2) {
		return impuestoRepository.findAllByFechaBetween(fecha1, fecha2);
	}

	/* Listar todos los impuestos por clave fiscal */
//	 @GetMapping("/impuesto/claveFiscal")
//	    public List<Impuesto> getClaveFiscal(String claveFiscal) {
//	    	return contribuyenteRepository.findAllByClaveFiscal(claveFiscal);
//	    } 

	@PostMapping("/impuesto/contribuyente/vincular/{tipoImpuesto}/{claveFiscal}")
	public ResponseEntity<?> asociarConImpuesto(@PathVariable String claveFiscal, String tipoImpuesto) {
		Contribuyente contribuyente = this.getContribuyente(claveFiscal);
		Impuesto impuesto = impuestoRepository.findByTipoImpuesto(tipoImpuesto);
		contribuyente.getImpuestos().add(impuesto);
		return new ResponseEntity<>(contribuyenteRepository.save(contribuyente), HttpStatus.OK);
	}

	/*
	 * @GetMapping("/impuesto") public Optional<Impuesto>
	 * getAllImpuestos(@PathVariable Integer idimpuesto) { return
	 * impuestoRepository.findAllById(idimpuesto);
	 * 
	 * 
	 * 
	 * @GetMapping("/impuesto/{idimpuesto}") // muestra impuesto por id public
	 * Optional<Impuesto> getAllById(@PathVariable Integer idimpuesto) { return
	 * impuestoRepository.findAllById(idimpuesto); }
	 * 
	 * //
	 */
//    @PostMapping("/impuesto/add")
//    public Impuesto createImpuesto(@RequestBody Impuesto body) {
//      return impuestoRepository.save(body);
//    }
//    
//   
//    @GetMapping("/impuestos/search2/{fecha1}/{fecha2}")
//    public List<Impuesto> getImpuestosByFecha(@PathVariable Date fecha1 ,@PathVariable Date fecha2 ) {
//        return impuestoRepository.findAllByFechaBetween(fecha1, fecha2);
//    }

	/*
	 * @GetMapping("/impuestos/claveFiscal") public List<ImpuestoClaveFiscalDto>
	 * getClaveFiscalContribuyente() { return
	 * impuestoRepository.findAllByClaveFiscalContribuyente(); }
	 */

}
