CREATE database  if not exists afip ;
 use  afip;
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


select * from impuesto;


