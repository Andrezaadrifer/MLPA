package Repositorio;

import java.util.ArrayList;

import javax.swing.JOptionPane;


import Condominio.Condominio;


public class RepositorioCondominio {

	static ArrayList<Condominio> condominios = new ArrayList<Condominio>();

	public void cadastrarCliente(Condominio condominio){
		condominios.add(condominio);
	}

	public boolean existeCondominio(String cnpj){
		boolean f = true;
		for(Condominio c : condominios){
			if(cnpj.equals(c.getCNPJ())){
				f = false;
				return f;
			}
		}
		return f;
	}

	//	public void imprimir(){
	//		for(Condominio c: clientes){
	//			JOptionPane.showConfirmDialog(null, "Cliente...\nCPF: " + c.getCpf()
	//					+ "\nNome: " + c.getNome() 
	//					+ "\nData de Nasc.: " + c.getDataNasc());
	//		}
	//	}
	//	
	//	public void alterarCliente(String cpf, String nome, String dataNasc){
	//		
	//		for(Cliente c : clientes){
	//			if(cpf.equals(c.getCpf())){
	//				c.setNome(nome);
	//				c.setDataNasc(dataNasc);
	//			}
	//		}
	//		
	//	}
	//	
	//	public Cliente consultaCliente(String cpf){
	//
	//		for(Cliente c : clientes){
	//			if(cpf.equals(c.getCpf())){
	//				return c;
	//			}
	//		}
	//		return null;
	//	}

}
