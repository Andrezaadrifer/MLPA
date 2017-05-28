package Cliente;

import Conta.Conta;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String dataNasc;
	private Conta numConta;
	
	public Cliente(String cpf, String nome, String dataNasc){
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String toString(){
		
		return "Cliente:\n" + "Cpf: " + this.getCpf() + "\nNome: " + this.getNome() + "\nData Nasc " + getDataNasc() + "\n";
		
	}
}
