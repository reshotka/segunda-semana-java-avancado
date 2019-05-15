package br.com.alexandra.model;

import br.com.alexandra.domain.Bolo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoloModel {
	
	private String nome;
	private String tamanho;
	private Double preco;
	
	public BoloModel (Bolo domain) {
		this.nome = domain.getNome();
		this.preco = domain.getPreco();
		this.tamanho = domain.getTamanho();
		
	}

}
