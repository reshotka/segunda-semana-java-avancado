package br.com.alexandra.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.alexandra.model.BoloModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

@Entity
@Table (name = "bolo")
public class Bolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
		
	@NotNull
	@Column (name = "nome", length = 128)
	private String nome;
	
	@NotNull
	@Column (name = "tamanho", length = 128)
	private String tamanho;
	
	@NotNull
	@Column (name = "preco")
	private Double preco;
	
	
	public Bolo (BoloModel model) {
		this ();
		this.nome = model.getNome();
		this.preco = model.getPreco();
		this.tamanho = model.getTamanho();
	}

}
