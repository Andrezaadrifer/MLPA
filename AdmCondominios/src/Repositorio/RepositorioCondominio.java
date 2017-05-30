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

	public void alterarCondominio(String cnpj2, String nome2, String end2, String caracteristicas2, String nomeSindico2) {

		for(Condominio c : condominios){
			if(cnpj2.equals(c.getCNPJ())){
				c.setCNPJ(cnpj2);
				c.setNome(nome2);
				c.setEndereco(end2);
				c.setNome(nome2);
				c.setNomeSindico(nomeSindico2);
			}
		}		
	}

	public void excluirCondominio(String numCNPJ) {
		for (Condominio c : condominios){
			if(numCNPJ == (c.getCNPJ())){
				condominios.remove(c);
			}
		}

	}

	public void imprimir() {

		for(Condominio c : condominios){
			JOptionPane.showConfirmDialog(null, "CONDOMÍNIO...\nCPF: " + c.getCNPJ()
			+ "\nNome: " + c.getNome() 
			+ "\nEndereço: " + c.getEndereco()
			+ "\nCaracteristicas: "+ c.getCaracteriscas() 
			+ "\nNome Sindico: "+ c.getNomeSindico());

		}
	}

	public boolean listaVazia() {
		boolean f = false;
		for(Condominio c : condominios){
			if((c.getCNPJ()).isEmpty()){
				f = true;
				return f;
			}
		}
		return f;
	}
}
