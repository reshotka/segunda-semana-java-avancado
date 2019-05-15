package br.com.alexandra.service;

import java.util.List;

import br.com.alexandra.domain.Bolo;
import br.com.alexandra.model.BoloModel;

public interface BoloService {
	
	Bolo criar (BoloModel model);
	List <Bolo> listarBolo ();
	

}
