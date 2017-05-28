package Repositorio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Cliente.Cliente;
import Conta.Conta;


public class RepositorioCliente {

	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public int numContaCliente(Cliente cpf){
		Conta conta = new Conta();
		if(cpf == conta.getTitular()){
			conta.getNumConta();
			return conta.getNumConta();
		}
		return 0;
	}

	public void cadastrarCliente(Cliente cliente){
		clientes.add(cliente);
	}

	public boolean existeCliente(String cpf){
		boolean f = false;
		for(Cliente c : clientes){
			if(cpf.equals(c.getCpf())){
				f = true;
				return f;
			}
		}
		return f;
	}

	public void imprimir(){
		for(Cliente c: clientes){
			Conta conta = new Conta();
			JOptionPane.showConfirmDialog(null,
					"Cliente Cadastrado"
							+ "\nCPF: " + c.getCpf()
							+ "\nNome: " + c.getNome() 
							+ "\nData de Nasc.: " + c.getDataNasc()
							+ "\nN°. conta: " + conta.getNumConta());
		}
	}

	public void alterarCliente(String cpf, String nome, String dataNasc){

		for(Cliente c : clientes){
			if(cpf.equals(c.getCpf())){
				c.setNome(nome);
				c.setDataNasc(dataNasc);
			}
		}

	}

	public Cliente consultaCliente(String cpf){
		for(Cliente c : clientes){
			if(cpf.equals(c.getCpf())){
				return c;
			}
		}
		return null;
	}

}
