package com.cdainfo.afip2.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="impuesto")
public class Impuesto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_impuesto")
    private String tipoImpuesto;

    @Column(name = "fecha")
    private  Date fecha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoImpuesto() {
		return tipoImpuesto;
	}

	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    	    
    
    
	@Override
    public String toString() {
        return "Impuesto: \n" +
                "   id: " + this.id +
                "\n   tipo_impuesto: " + this.tipoImpuesto +
                "\n   fecha: " + this.fecha;
    }
	
	
	
	
	
	
	
	/* esta es la que va
	 drop database if exists afip4;
	CREATE schema afip4 ;
	use  afip4;
	CREATE TABLE impuesto (
	  idimpuesto INT NOT NULL AUTO_INCREMENT,
	  tipo_impuesto VARCHAR(80) NULL,
	  fecha DATE NULL,
	  PRIMARY KEY (idimpuesto))
	  ;

	CREATE TABLE contribuyente (
	  num_fiscal INT(8) NOT NULL,
	  nombre varchar(30),
	  apellido varchar(30),
	  PRIMARY KEY (num_fiscal)
	);


	insert into impuesto
	(idimpuesto,tipo_impuesto,fecha)
	values
	(default, 'impuesto a las ganancias', '2020-01-10' ),
	(default, 'impuesto al vendedor agregado', '2020-01-02' ),
	(default, 'impuesto a la ganancia minima presunta', '2020-02-06' ),
	(default, 'impuesto a los bienes personales', '2020-02-04' ),
	(default, 'impuesto sobre los debitos y creditos bancarios', '2020-01-30' ),
	(default, 'impuesto sobre los ingresos brutos', '2020-01-20' ),
	(default, 'impuesto al sello', '2020-01-11' ),
	(default, 'impuesto a la transferencia de inmuebles', '2020-02-02' );


	insert into contribuyente
	(num_fiscal, nombre, apellido)
	values
	(2737,"florencia","forneron"),
	(2035,"maria","perez"),
	(2739,"juan","diaz"),
	(2037,"ricardo","fort"),
	(8610,"pepe","lopez"),
	(8612,"ricardo","acosta");
    
    
*/
    
   
	
	
	
	
    /* CREATE schema afip4 ;
	use  afip4;
	CREATE TABLE impuesto (
		idimpuesto INT NOT NULL AUTO_INCREMENT,
		tipo_impuesto VARCHAR(45) NULL,
		fecha DATE NULL,
		PRIMARY KEY (idimpuesto))
		;

	CREATE TABLE contribuyente (
		idcontribuyente int(20) NOT NULL AUTO_INCREMENT,
		num_fiscal int(20) DEFAULT NULL,
		idimpuesto int not null,
		PRIMARY KEY (idcontribuyente),
		KEY imp_fk (idimpuesto),
		CONSTRAINT imp_fk FOREIGN KEY (idimpuesto) REFERENCES impuesto (idimpuesto)
	) */

}
