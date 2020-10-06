
public class Agencia {

	private int numero;
	private String nome;
	private String gerente;
	private Endereco endereco;
	
	public Agencia(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public Agencia(int numero, String nome, String gerente) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.gerente = gerente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", nome=" + nome + ", gerente=" + gerente + ", endereco=" + endereco + "]";
	}

	
	
	
	
}
