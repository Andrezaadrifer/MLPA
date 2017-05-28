package Conta;

import Cliente.Cliente;


public class ContaBonificada extends Conta{

	public ContaBonificada() {
		super();
	}

	public ContaBonificada(Cliente titular, double valor) {
		super(titular, valor);
	}
}
