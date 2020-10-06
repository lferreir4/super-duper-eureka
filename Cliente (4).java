package br.com.trainning.model.dao;

import java.util.Date;

public class Cliente extends Pessoa {

	private boolean mensalista;
	private Date dataVencimento;
	private Endereco endereco;
	private Veiculo veiculo;
	private Vaga vagaMensalista;

	public Cliente(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
	
	
	}

	public Cliente(String cpf, String nome, String telefone, String email, boolean mensalista, Date dataVencimento, Vaga vagaMensalista) {
		super(cpf, nome, telefone, email);
		this.mensalista = mensalista;
		this.dataVencimento = dataVencimento;
		this.vagaMensalista = vagaMensalista;
	}
	
	public void setVagaMensalista(Vaga vagaMensalista) {
		this.vagaMensalista = vagaMensalista;
	}
	
	public Vaga getVagaMensalista() {
		return vagaMensalista;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public boolean isMensalista() {
		return mensalista;
	}

	public void setMensalista(boolean mensalista) {
		this.mensalista = mensalista;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [mensalista=" + mensalista + ", dataVencimento=" + dataVencimento + ", endereco=" + endereco
				+ ", veiculo=" + veiculo + "]";
	}

	
}
