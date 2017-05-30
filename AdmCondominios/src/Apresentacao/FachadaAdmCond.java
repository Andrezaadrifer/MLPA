package Apresentacao;

import Condominio.Condominio;
import Excecoes.CondominioJaCadastradoException;
import Repositorio.RepositorioCondominio;


public class FachadaAdmCond {

	RepositorioCondominio repCond;
	Condominio cond; 

	public FachadaAdmCond() {
		repCond = new RepositorioCondominio();
	}

	public void cadastrarCondominio(String cnpj, String nome, String end, String caracteristicas,
			String nomeSindico) throws CondominioJaCadastradoException{

		if(repCond.existeCondominio(cnpj)){
			cond = new Condominio (cnpj, nome, end, caracteristicas, nomeSindico);
			repCond.cadastrarCliente(cond);
		}else {
			throw new CondominioJaCadastradoException();
		}
	}	

}


