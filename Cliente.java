
public class Cliente {

	private String nomeCliente;
	private String cpf;
	private String email;
	
	//get
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	//set
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//imprimir
	public void imprimir() {
		System.out.println("Nome: " + nomeCliente);
		System.out.println("CPF: " + cpf );
		System.out.println("email: " + email);
	}
	
	
}
