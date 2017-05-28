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
			if(numConta==c.getNumConta()){
				return c.getSaldo();
			}
		}
		return null;
	}

	public void retirarSaque (double valorSaque, int numConta) {
		for (Conta c : contas){
			if(numConta==c.getNumConta()){
				c.setSaldo(c.getSaldo()-valorSaque);
			}
		}
	}

	public void addDeposito(double valorDeposito, int numConta) {
		for (Conta c : contas){
			if(numConta==c.getNumConta()){
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

	public boolean existeConta(int numConta) {
		boolean f = false;
		for (Conta c : contas){
			if(c.getNumConta()== numConta){
				f = true;
			}
		}
		return f;
	}
}


