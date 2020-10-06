package br.com.trainning.model.dao;

public abstract class Funcionario extends Pessoa {

	private double salario;
	
	public Funcionario(String cpf, String nome, String telefone, String email, double salario) {
		super(cpf, nome, telefone, email);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()  + " Funcionario [salario=" + salario + "]";
	}

	
	
	
}
