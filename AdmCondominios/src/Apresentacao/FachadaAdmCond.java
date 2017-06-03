package Apresentacao;

import javax.swing.JOptionPane;

import Condominio.Condominio;
import Excecoes.CondominioInvalidoException;
import Excecoes.CondominioJaCadastradoException;
import Excecoes.ListaVaziaCondominiosException;
import Repositorio.RepositorioCondominio;


public class FachadaAdmCond {

	RepositorioCondominio repCond;
	Condominio cond; 

	public FachadaAdmCond() {
		repCond = new RepositorioCondominio();
	}

	public void cadastrarCondominio(String cnpj, String nome, String end, String caracteristicas,
			String nomeSindico) throws CondominioJaCadastradoException{

		if(!repCond.existeCondominio(cnpj)){
			cond = new Condominio (cnpj, nome, end, caracteristicas, nomeSindico);
			repCond.cadastrarCond(cond);
		}else {
			throw new CondominioJaCadastradoException();
		}
	}

	public void alterarCondominio(String cnpj4, String cnpj2, String nome2, String end2, String caracteristicas2,
			String nomeSindico2) throws CondominioInvalidoException{
		if(repCond.existeCondominio(cnpj4)){
			repCond.alterarCondominio(cnpj4,cnpj2, nome2, end2,caracteristicas2, nomeSindico2);
		}else {
			throw new CondominioInvalidoException();
		}		
	}

	public void excluirCondominio(String numCNPJ) 
			throws CondominioInvalidoException{
		if(repCond.existeCondominio(numCNPJ)){
			repCond.excluirCondominio(numCNPJ);
		}else {
			throw new CondominioInvalidoException();
		}
	}

	public void imprimirCondominios()
			throws ListaVaziaCondominiosException{
		if(repCond.listaVazia()){
			repCond.imprimir();
		}else{
			throw new ListaVaziaCondominiosException();
		}
	}

	public void consultarCond(String cnpj) 
			throws CondominioInvalidoException{
		if(repCond.existeCondominio(cnpj)){
			repCond.imprimirCond(cnpj);
		}else {
			throw new CondominioInvalidoException();
		}
	}	

	public void existeCond(String cnpj) 
			throws CondominioCnpjNullException{
		if(repCond.existeCondominio(cnpj)){
			repCond.existeCondominio(cnpj);
		}else {
			throw new CondominioCnpjNullException();
		}
	}	
}


