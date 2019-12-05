
SELECT * FROM afip.impuesto;
use  afip;
insert into impuesto
(id,tipo_impuesto,fecha)
values
(default, 'impuesto a las ganancias', '2020-01-10' ),
(default, 'impuesto al vendedor agregado', '2020-01-02' ),
(default, 'impuesto a la ganancia minima presunta', '2020-02-06' ),
(default, 'impuesto a los bienes personales', '2020-02-04' ),
(default, 'impuesto sobre los debitos y creditos bancarios', '2020-01-30' ),
(default, 'impuesto sobre los ingresos brutos', '2020-01-20' ),
(default, 'impuesto al sello', '2020-01-11' ),
(default, 'impuesto a la transferencia de inmuebles', '2020-02-02' );