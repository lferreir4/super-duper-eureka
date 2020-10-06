package br.com.trainning.model;

import java.util.HashSet;
import java.util.Set;

public class Estacionamento {

	private int id;
	private Endereco endereco;
	private String cnpj;
	private Gerente gerente;
	private Set<Vaga> vagas = new HashSet<Vaga>();
	
	public Estacionamento(Endereco endereco, String cnpj, Gerente gerente) {
		super();
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.gerente = gerente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Set<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(Set<Vaga> vagas) {
		this.vagas = vagas;
	}

	@Override
	public String toString() {
		return "Estacionamento [id=" + id + ", endereco=" + endereco + ", cnpj=" + cnpj + ", gerente=" + gerente
				+ ", vagas=" + vagas + "]";
	} 
	
	
	
	
}
