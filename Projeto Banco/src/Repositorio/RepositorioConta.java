package Repositorio;

import java.util.ArrayList;

import Conta.Conta;

public class RepositorioConta {

	ArrayList<Conta> contas = new ArrayList<Conta>();

	public void inserirConta(Conta conta){
		contas.add(conta);
	}

	public Double consultaSaldo (int numConta){
		for (Conta c : contas){
			return c.getSaldo();
		}
		return null;
	}

	public int consultaConta (int numConta) {
		for (Conta c : contas){
			if(numConta == c.getNumConta()){
				return c.getNumConta();
			}
		}
		return 0;
	}

	public void retirarSaque (double valorSaque, int numConta) {
		for (Conta c : contas){
			if(numConta == (c.getNumConta())){
				c.setSaldo(c.getSaldo()-valorSaque);
			}
		}
	}

	public void addDeposito(double valorDeposito, int numConta) {
		for (Conta c : contas){
			if(numConta == (c.getNumConta())){
				c.setSaldo((c.getSaldo())+valorDeposito);
			}
		}
	}

	public void excluiConta(int numConta) {
		for (Conta c : contas){
			if(numConta == (c.getNumConta())){
				contas.remove(c);
			}
		}
	}
}


