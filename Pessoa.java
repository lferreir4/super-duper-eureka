package br.com.trainning.model;

public abstract class Pessoa {

	private int id;
	private String cpf;
	private String nome;
	private String telefone;
	private String email;

	public Pessoa(String cpf, String nome, String telefone, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ "]";
	}

}
