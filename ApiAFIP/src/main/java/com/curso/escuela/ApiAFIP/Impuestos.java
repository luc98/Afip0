package com.curso.escuela.ApiAFIP;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuestos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipoimpuesto")
	private String tipo;
	@Column(name = "fecha")
	private String fecha;
	public String getTipoimpuesto() {
		return tipo;
	}

	public void setTipoimpuesto(String tipoimpuesto) {
		this.tipo = tipoimpuesto;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha=fecha;
	}
}
