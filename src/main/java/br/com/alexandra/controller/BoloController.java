package br.com.alexandra.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandra.model.BoloModel;
import br.com.alexandra.service.BoloService;

@RestController
@RequestMapping("/bolo")
public class BoloController {
	
	@Autowired
	private BoloService boloService;
	
	@PostMapping ("/criar")
	public BoloModel criar (@RequestBody BoloModel model) {
		return new BoloModel(boloService.criar(model));
	}
	
	@GetMapping ("/listar-bolo")
	public List <BoloModel> listarBolo() {
		return boloService.listarBolo().stream().map(BoloModel::new).collect(Collectors.toList());
	}
	
	

}
