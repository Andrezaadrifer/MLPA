package Conta;

import Cliente.Cliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente titular, double valor) {
		super(titular, valor);
	}

	public ContaPoupanca(){
		super();
	}

	public String toString(){
		return "conta " + this.getNumConta() + "\n" + titular + "\nSaldo disponivel " + getSaldo() + "\n";
	}
}

