package br.com.trainning.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Vaga {

	private int id;
	private Veiculo veiculo;
	private Manobrista manobrista;
	private Date dataEntrada;
	private Date dataSaida;
	private Posicao posicao;
	private double valor;
	private List<String>[] fotos;

	public Vaga(int id, Veiculo veiculo, Manobrista manobrista, Date dataEntrada, Date dataSaida, Posicao posicao,
			double valor, List<String>[] fotos) {
		super();
		this.id = id;
		this.veiculo = veiculo;
		this.manobrista = manobrista;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.posicao = posicao;
		this.valor = valor;
		this.fotos = fotos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Manobrista getManobrista() {
		return manobrista;
	}

	public void setManobrista(Manobrista manobrista) {
		this.manobrista = manobrista;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<String>[] getFotos() {
		return fotos;
	}

	public void setFotos(List<String>[] fotos) {
		this.fotos = fotos;
	}

	@Override
	public String toString() {
		return "Vaga [id=" + id + ", veiculo=" + veiculo + ", manobrista=" + manobrista + ", dataEntrada=" + dataEntrada
				+ ", dataSaida=" + dataSaida + ", posicao=" + posicao + ", valor=" + valor + ", fotos="
				+ Arrays.toString(fotos) + "]";
	}

}
