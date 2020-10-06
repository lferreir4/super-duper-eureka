
public class TesteConta {

	public static void main(String[] args) {
		
		
		//criando o cliente
		Cliente cliente = new Cliente();
		cliente.setCpf("123456789");
		cliente.setEmail("ericotorres76@gmail.com");
		cliente.setNomeCliente("erico torres");
		
		Conta conta = new Conta();
		conta.setCliente(cliente);
		conta.setSaldo(100);

		Conta conta2 = new Conta();
		conta2.setCliente(cliente);
		conta2.setSaldo(100);

		conta.imprimir();
		conta.sacar(50);
		conta.sacar(50);
		conta.depositar(25);
	}

}
