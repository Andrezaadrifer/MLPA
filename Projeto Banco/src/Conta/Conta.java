package Conta;

import Cliente.Cliente;

public class Conta {
	
	private static int contador = 1000;
	public double saldo;
	public Cliente titular;
	private int numConta;

	public Conta(Cliente titular, double valor){
		this.titular = titular;
		this.saldo = valor;
		this.numConta = Conta.contador++;

	}

	public Conta (int numConta1){
		this.numConta = numConta1;
	}

	public Conta(){

	}


	public double ConsultarSaldo(int numConta){
		return getSaldo();
	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void sacar(double valor){
		saldo-= valor;
	}

	public void transferir(Conta conta, double valor){
		conta.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta (int numConta) {
		Conta.contador = numConta;
	}

	public String toString(){

		return "conta " + this.getNumConta() + "\n" + titular + "\nSaldo disponivel " + getSaldo() + "\n";

	}
}
