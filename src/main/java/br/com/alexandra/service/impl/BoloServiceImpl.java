package br.com.alexandra.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandra.domain.Bolo;
import br.com.alexandra.model.BoloModel;
import br.com.alexandra.repository.BoloRepository;
import br.com.alexandra.service.BoloService;

@Transactional
@Service
public class BoloServiceImpl implements BoloService {
	
	@Autowired
	BoloRepository boloRepository;

	public Bolo criar(BoloModel model) {
		return boloRepository.save(new Bolo(model));
	}

	public List<Bolo> listarBolo() {
		return boloRepository.findAll();
	}

}
