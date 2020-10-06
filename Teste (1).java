package br.com.trainning.view;

import java.util.Date;

import br.com.trainning.model.dao.Carro;
import br.com.trainning.model.dao.Cliente;
import br.com.trainning.model.dao.Endereco;
import br.com.trainning.model.dao.Estacionamento;
import br.com.trainning.model.dao.Gerente;
import br.com.trainning.model.dao.Manobrista;
import br.com.trainning.model.dao.Vaga;

public class Teste {

	public static void main(String[] args) {

		Manobrista manobrista = new Manobrista("1", "func1", "11 12345 6789", "func@gmail.com", 2500);
		Gerente gerente = new Gerente("2", "gerente1", "11 9999", "ger@gmail.com", 3500);
		Endereco enderecoEstacionamento = new Endereco("rua x", "bairro x", "cidade x", "sp");

		Estacionamento estacionamento = new Estacionamento(enderecoEstacionamento, "00.000.000/0001-21", gerente);

		Cliente cliente = new Cliente("123", "cli1", "tel", "email");
		Carro carro = new Carro(1, "placa1234", "preto", "fabricante", "modelo", cliente);

		Cliente cliente2 = new Cliente("345", "cli2", "tel", "email");
		Carro carro2 = new Carro(2, "placa555", "preto", "fabricante", "modelo", cliente2);
		
		Cliente cliente3 = new Cliente("333", "cli3", "tel", "email", true, new Date(),new Vaga(15));
		Carro carro3 = new Carro(3, "placa333", "preto", "fabricante", "modelo", cliente3);
		
		
		try {

			Vaga vagaOcupada = estacionamento.estacionar(carro, manobrista);
			System.out.println("Carro estacionado na vaga " + vagaOcupada);
			
			Vaga vagaOcupada2 = estacionamento.estacionar(carro2, manobrista);
			System.out.println("Carro estacionado na vaga " + vagaOcupada2);

			Vaga vagaOcupada3 = estacionamento.estacionar(carro3, manobrista);
			System.out.println("Carro estacionado na vaga " + vagaOcupada3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
