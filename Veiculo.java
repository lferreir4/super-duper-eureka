package br.com.trainning.model;

public abstract class Veiculo {

	private int id;
	private String placa;
	private String cor;
	private String fabricante;
	private String modelo;
	private Cliente cliente;

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", placa=" + placa + ", cor=" + cor + ", fabricante=" + fabricante + ", modelo="
				+ modelo + ", cliente=" + cliente + "]";
	}

	public Veiculo(int id, String placa, String cor, String fabricante, String modelo, Cliente cliente) {
		super();
		this.id = id;
		this.placa = placa;
		this.cor = cor;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
