
public class Conta {
	//definicao das variaveis
	private double saldo;
	private Cliente c = new Cliente();

	
	//get
	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.c;
	}
	
	
	//set
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setCliente(Cliente cliente) {
		this.c = cliente;
	}
	
	
	//imprimir
	public void imprimir() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Cliente: ");
		System.out.println("-------------------------");
		c.imprimir();
	}
	
	
	//depositar
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depositando " + valor);
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	//sacar - verificar se o saldo é suficinte para sacar
	public double sacar(double valor) {
		
		if(valor > this.saldo) {
			System.out.println("Saldo de " + this.saldo  + " insuficiente para um saque de " + valor);
		} else {
			System.out.println("Sacando " + valor);
			this.saldo = this.saldo - valor;
			System.out.println("Saldo atual: " + this.saldo);
		}
		
		return this.saldo;
	}
	
	
	
}
