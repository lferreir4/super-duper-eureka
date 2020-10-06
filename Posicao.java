package br.com.trainning.model;

public class Posicao {

	private int id;
	private int andar;
	private String zona;

	public Posicao(int id, int andar, String zona) {
		super();
		this.id = id;
		this.andar = andar;
		this.zona = zona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Posicao [id=" + id + ", andar=" + andar + ", zona=" + zona + "]";
	}

}
