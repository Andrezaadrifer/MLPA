package Apresentacao;

import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaBonificada;
import Conta.ContaPoupanca;
import Excecoes.ClienteInvalidoException;
import Excecoes.ClienteJaCadastradoException;
import Excecoes.ContaInvalidaException;
import Excecoes.SaldoInsuficienteException;
import Excecoes.ValorInvalidoException;
import Repositorio.RepositorioCliente;
import Repositorio.RepositorioConta;

public class FachadaBanco {

	RepositorioCliente repCliente;
	RepositorioConta repConta;
	Cliente cliente; 
	Conta conta, poupanca, bonificada;

	public FachadaBanco(){
		repCliente = new RepositorioCliente();
		repConta = new RepositorioConta();
	}

	public void cadastrarCliente(String cpf, String nome, String dataNasc)
			throws ClienteJaCadastradoException{

		if(repCliente.existeCliente(cpf)){
			cliente = new Cliente(cpf, nome, dataNasc);
			repCliente.cadastrarCliente(cliente);
		}else {
			throw new ClienteJaCadastradoException();
		}
	}

	public void imprimirCliente(){
		repCliente.imprimir();
	}

	public void alterarCliente(String cpf, String nome, String dataNasc)
			throws ClienteInvalidoException{
		if(!repCliente.existeCliente(cpf)){
			repCliente.alterarCliente(cpf, nome, dataNasc);
		}else {
			throw new ClienteInvalidoException();
		}
	}

	public void inserirConta(Cliente titular, double valor)
			throws ClienteInvalidoException, ValorInvalidoException{

		if(!repCliente.existeCliente(titular.getCpf())){
			if(valor > 0.0){
				conta = new Conta(titular, valor);
				repConta.inserirConta(conta);
			}else {
				throw new ValorInvalidoException();
			}
		}else {
			throw new ClienteInvalidoException();
		}
	}

	public void inserirContaPoupanca(Cliente titula, double valor)
			throws ClienteInvalidoException, ValorInvalidoException{

		if(!repCliente.existeCliente(titula.getCpf())){
			if(valor >= 100.0){
				poupanca = new ContaPoupanca(titula, valor);
				repConta.inserirConta(poupanca);
			}else {
				throw new ValorInvalidoException();
			}
		}else {
			throw new ClienteInvalidoException();
		}
	}

	public void inserirContaBonificada(Cliente titula, double valor)
			throws ClienteInvalidoException, ValorInvalidoException{

		if(!repCliente.existeCliente(titula.getCpf())){
			if(valor >= 5){
				bonificada = new ContaBonificada(titula, valor);
				repConta.inserirConta(bonificada);
			}else {
				throw new ValorInvalidoException();
			}
		}else {
			throw new ClienteInvalidoException();
		}
	}

	public Cliente consultaCliente(String cpf){

		Cliente cliente = repCliente.consultaCliente(cpf);

		return cliente;

	}

	public Double consultarSaldo(int numConta) 
			throws ContaInvalidaException{
		if(repConta.existeConta(numConta)){
			Double saldo = repConta.consultaSaldo(numConta);
			return saldo;
		}else{
			throw new ContaInvalidaException();
		}
	}

	public void saqueConta(int numconta, double valorSaque) 
			throws SaldoInsuficienteException,ContaInvalidaException,ValorInvalidoException{
		if(repConta.existeConta(numconta)){
			if(valorSaque <= repConta.consultaSaldo(numconta)){
				if (valorSaque!=0){
					repConta.retirarSaque(valorSaque, numconta);
				}else{
					throw new ValorInvalidoException();
				}
			}else{
				throw new SaldoInsuficienteException();
			}
		}else{
			throw new ContaInvalidaException();
		}
	}

	public void depositoConta(int numConta, double valorDeposito)
			throws ValorInvalidoException,ContaInvalidaException{

		if(repConta.existeConta(numConta)){
			if(valorDeposito>0){
				repConta.addDeposito(valorDeposito, numConta);
			}else{
				throw new ValorInvalidoException();
			}
		}else{
			throw new ContaInvalidaException();
		}
	}

	public void excluirConta(int numConta) {

		repConta.excluiConta(numConta);
	}

	public void consultarConta(int numConta) {
		repConta.existeConta(numConta);

	}

}
