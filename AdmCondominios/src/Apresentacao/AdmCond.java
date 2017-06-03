package Apresentacao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Excecoes.CondominioInvalidoException;
import Excecoes.CondominioJaCadastradoException;
import Excecoes.ListaVaziaCondominiosException;

public class AdmCond {

	public static void main(String[] args) throws CondominioInvalidoException{

		FachadaAdmCond fachada = new FachadaAdmCond();

		int opcao = 0;

		while (opcao != 6) {

			try {
				String[] options = {"Listar condomínios ",
						 "Cadastrar condomínio" ,
						 "Consultar condomínio",
						"Alterar dados do condomínio",
						 "Excluir condomínio " ,
						 "Sair "};
				ImageIcon icon = new ImageIcon("src/img/condominios.png");
		        String n = (String)JOptionPane.showInputDialog(null, "Funcionalidades",
		        		"SISTEMA PARA CONDOMÍNIO",JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
		        if(n.equals("Listar condomínios ")){
		        	opcao = 1;
		        }else if(n.equals( "Cadastrar condomínio")){
		        	opcao = 2;
		        }else if(n.equals("Alterar dados do condomínio")){
		        	opcao = 3;
		        }else if(n.equals("Excluir condomínio ")){
		        	opcao = 4;
		        }else if(n.equals("Excluir condomínio ")){
		        	opcao = 5;
		        }else if(n.equals("Sair ")){
		        	opcao = 6;
		        }
		        
//				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
//
//						  n+": \n\n "
//								+ "Funcionalidades:\n\n"
//								+ " (1) Listar condomínios\n "
//								+ "(2) Cadastrar condomínio\n " 
//								+ "(3) Consultar condomínio\n " 
//								+ "(4) Alterar dados do condomínio\n "
//								+ "(5) Excluir condomínio\n " 
//								+ "(6) Sair\n "
//				                ));

				switch (opcao) {
				case 1:

					try {
						fachada.imprimirCondominios();
					} catch (ListaVaziaCondominiosException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage(),"informação", 0,JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					JOptionPane.showConfirmDialog(null,
							"Para cadastrar um condomínio informe os dados dele a seguir","informação",JOptionPane.PLAIN_MESSAGE);
					String cnpj = JOptionPane.showInputDialog("Cadastrar CNPJ:","Digite o CNPJ").trim().toUpperCase();
					String nome = JOptionPane.showInputDialog("Cadastrar nome:","Digite o nome").trim().toUpperCase();
					String end = JOptionPane.showInputDialog("Cadastrar endereço:","Digite rua/bairro").trim().toUpperCase();
					String caracteristicas = JOptionPane.showInputDialog("Cadastrar caraterísticas:","Digite se tem piscina...").trim().toUpperCase();
					String nomeSindico = JOptionPane.showInputDialog("Cadastrar nome síndico:","Digite o nome do síndico").trim().toUpperCase();

					try {
						fachada.cadastrarCondominio(cnpj, nome, end, caracteristicas, nomeSindico);

					} catch (CondominioJaCadastradoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage(),"informação", 0,JOptionPane.ERROR_MESSAGE);
					}

					break;
				case 3:
					String cnpj3 = JOptionPane.showInputDialog("Consultar:","Digite o CNPJ").trim().toUpperCase();
					try {
						fachada.consultarCond(cnpj3);
						break;
					} catch ( CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage(),"informação", 0,JOptionPane.ERROR_MESSAGE);
					}
					break;

				case 4:
					String cnpj4 = JOptionPane.showInputDialog("Informe condominio que deseja alterar:",
							"digite o CNPJ").trim().toUpperCase();

					try {
						fachada.consultarCond(cnpj4);
						JOptionPane.showConfirmDialog(null,
								"Para alterar informe os novos dados","informação",JOptionPane.PLAIN_MESSAGE);
						String cnpj2 = JOptionPane.showInputDialog("Cadastrar CNPJ:","Digite o CNPJ").trim().toUpperCase();
						String nome2 = JOptionPane.showInputDialog("Cadastrar nome:","Digite o nome").trim().toUpperCase();
						String end2 = JOptionPane.showInputDialog("Cadastrar endereço:","Digite rua/bairro:").trim().toUpperCase();
						String caracteristicas2 = JOptionPane.showInputDialog("Cadastrar caraterísticas:","Digite se tem piscina...").trim().toUpperCase();
						String nomeSindico2 = JOptionPane.showInputDialog("Cadastrar nome síndico:","Digite o nome do síndico:").trim().toUpperCase();
						fachada.alterarCondominio(cnpj4,cnpj2, nome2, end2, caracteristicas2, nomeSindico2);

					} catch (CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}

					break;

				case 5:
					String cnpj5 =JOptionPane.showInputDialog("Excluir Condomínio:","Digite o CNPJ").trim().toUpperCase();
					try {
						fachada.excluirCondominio(cnpj5);
						JOptionPane.showConfirmDialog(null, "Condomínio excluido.","informação",JOptionPane.PLAIN_MESSAGE);
					} catch (CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage(),"informação", 0,JOptionPane.ERROR_MESSAGE);
					}
					break;


				default:
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
