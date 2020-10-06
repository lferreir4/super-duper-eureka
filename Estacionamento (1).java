package br.com.trainning.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.trainning.excecoes.NaoHaVagaDisponivelException;

public class Estacionamento {

	private int id;
	private Endereco endereco;
	private String cnpj;
	private Gerente gerente;
	private List<Vaga> vagas = new ArrayList<Vaga>();

	{
		System.out.println("Criando o patio de vagas do estacionamento");
		// criando as vagas vazias
		for (int i = 1; i <= 20; i++) {
			Posicao posicao = new Posicao(i, 1, "zona livre");
			Vaga vaga = new Vaga(i, null, null, null, null, posicao, 0, null);
			vagas.add(vaga);
		}

	}

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

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

	@Override
	public String toString() {
		return "Estacionamento [id=" + id + ", endereco=" + endereco + ", cnpj=" + cnpj + ", gerente=" + gerente
				+ ", vagas=" + vagas + "]";
	}

	public Vaga estacionar(Veiculo veiculo, Manobrista manobrista) throws NaoHaVagaDisponivelException {

		System.out.println("Estacionando um veiculo...");
		Vaga vaga = veiculo.getCliente().getVagaMensalista();

		if (vaga != null) {

			System.out.println("Procurando a vaga de mensalista " + vaga.toString());
			vaga = vagas.get(vagas.indexOf(vaga));

		} else {

			System.out.println("Procurando uma vaga para um diarista...");

			for (Vaga v : vagas) {
				if (v.getDataEntrada() == null) {
					System.out.println("Achei uma vaga disponivel: " + v);
					vaga = v;
					break; // se encontrei uma vaga, posso parar de procurar
				}
			}

			if (vaga == null) {
				throw new NaoHaVagaDisponivelException();
			}

		}
		vaga.setDataEntrada(new Date());
		vaga.setDataSaida(null);
		vaga.setManobrista(manobrista);
		vaga.setVeiculo(veiculo);
		return vaga;

	}

}
