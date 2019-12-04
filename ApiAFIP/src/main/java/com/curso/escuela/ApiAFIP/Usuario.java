package com.curso.escuela.ApiAFIP;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	private Long clavefiscal;
	

	public Long getClaveFiscal() {
		return clavefiscal;
	}
	public void setClaveFiscal(Long clavefiscal) {
		this.clavefiscal=clavefiscal;
	}
	
	
}
