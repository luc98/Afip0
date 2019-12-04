package com.curso.escuela.ApiAFIP;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AfipController {
	@Autowired
	ImpuestoRepository Repo;


	@GetMapping("/IGanancias/liquidacion/{fecha1}/{fecha2}")
		public List<Impuestos>getFechasLiquidacion(@PathVariable Date fecha1, Date fecha2){
		List<Impuestos> l= Repo.findByCreatedDateBetween(fecha1, fecha2);
		return l;
	}
	
	@GetMapping("/Impuestos/{clavefiscal}")
		public List<Impuestos>getImpuestosByNmroFiscal(@PathVariable Long clavefiscal){
		
		return Repo.findAllByNmroFiscal(clavefiscal);
	}
	
	
	@GetMapping("impuesto/{tipo}")
    public Impuestos getImpuesto(@PathVariable String tipoimpuesto) {
        return Repo.findByTipoLike(tipoimpuesto);
        		//impuestoRepository.findByTipoLike(tipo);
    }
	@PutMapping("impuesto/{tipo}/{fecha}")
    public Impuestos updateImpuestoDates(@PathVariable String tipo,@PathVariable String fecha) {
        
        Impuestos impuesto = this.getImpuesto(tipo);
        impuesto.setFecha(fecha);
        return Repo.save(impuesto);
    }
	
}
