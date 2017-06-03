package Repositorio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Condominio.Condominio;


public class RepositorioCondominio {

	static ArrayList<Condominio> condominios = new ArrayList<Condominio>();

	public void cadastrarCond(Condominio condominio){
		condominios.add(condominio);
		JOptionPane.showConfirmDialog(null, "Condomínio Cadastrado.","informação",JOptionPane.PLAIN_MESSAGE);
	}

	public boolean existeCondominio(String cnpj){
		boolean f = false;
		for(Condominio c : condominios){
			if(cnpj.equals(c.getCNPJ())){
				f = true;
				
				return f;
			}
		}
		return f;
	}

	public void alterarCondominio(String cnpj4, String cnpj2, String nome2, String end2, String caracteristicas2, String nomeSindico2) {

		for(Condominio c : condominios){
			if(cnpj4.equals(c.getCNPJ())){
				c.setCNPJ(cnpj2);
				c.setNome(nome2);
				c.setEndereco(end2);
				c.setCaracteriscas(caracteristicas2);
				c.setNomeSindico(nomeSindico2);
			}
		}		
		JOptionPane.showConfirmDialog(null, "Condomínio Alterado!");
	}

	public void excluirCondominio(String numCNPJ) {
		for (Condominio c : condominios){
			if(numCNPJ.equals(c.getCNPJ())){
				condominios.remove(c);
				JOptionPane.showConfirmDialog(null, "Condominio excluido","informação",JOptionPane.PLAIN_MESSAGE);
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
		JOptionPane.showConfirmDialog(null, "Fim da lista.","informação",JOptionPane.PLAIN_MESSAGE);
	}

	public boolean listaVazia() {
		boolean f = false;
		for(Condominio c : condominios){
			if(!((c.getCNPJ()).isEmpty())){
				f = true;
				return f;
			}
		}
		return f;
	}

	public void imprimirCond(String cnpj) {
		for(Condominio c : condominios){
			if(c.getCNPJ().equals(cnpj)){
				JOptionPane.showConfirmDialog(null, "CONDOMÍNIO...\nCPF: " + c.getCNPJ()
				+ "\nNome: " + c.getNome() 
				+ "\nEndereço: " + c.getEndereco()
				+ "\nCaracteristicas: "+ c.getCaracteriscas() 
				+ "\nNome Sindico: "+ c.getNomeSindico());
			}		

		}
	}
}
