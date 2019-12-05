package com.cdainfo.afip2.dominio;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="contribuyente")
public class Contribuyente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="clave_fiscal")
	private String claveFiscal;
	
	@Column(name = "nombre")
    private  String nombre;
    
    @Column(name = "apellido")
    private  String apellido;
	
	@Override
	public String toString() {
		return "Contribuyente [id=" + id + ", claveFiscal=" + claveFiscal + ", nombre=" + nombre + ", apellido="
				+ apellido + ", impuestos=" + impuestos + "]";
	}

	@ManyToMany
	@JoinTable(name= "impuesto_contribuyente")
	private List<Impuesto> impuestos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClaveFiscal() {
		return claveFiscal;
	}

	public void setClaveFiscal(String claveFiscal) {
		this.claveFiscal = claveFiscal;
	}

	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}


	
	
	/*   @Column(name = "num_fiscal")
    private String numeroFiscal; 

    @Column(name = "idimpuesto")
    private  Integer idImpuesto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroFiscal() {
		return numeroFiscal;
	}

	public void setNumeroFiscal(String numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}

	public Integer getIdImpuesto() {
		return idImpuesto;
	}

	public void setIdImpuesto(Integer idImpuesto) {
		this.idImpuesto = idImpuesto;
	}
    
	@Override
    public String toString() {
        return "Contribuyente: \n" +
                "   id: " + this.id +
                "\n   numeroFiscal: " + this.numeroFiscal +
                "\n   idImpuesto: " + this.idImpuesto;
    }
    
	*/

}
