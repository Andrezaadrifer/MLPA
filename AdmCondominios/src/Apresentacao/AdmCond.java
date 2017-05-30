package Apresentacao;

import javax.swing.JOptionPane;

import Excecoes.ClienteJaCadastradoException;
import Excecoes.CondominioInvalidoException;
import Excecoes.CondominioJaCadastradoException;

public class AdmCond {

	public static void main(String[] args) throws CondominioInvalidoException{

		FachadaAdmCond fachada = new FachadaAdmCond();

		int opcao = 0;

		while (opcao != 5) {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Inserir condom�nio\n " 
								+ "2 - Consultar condom�nio\n " 
								+ "3 - Aterar Dados do condom�nio\n "
								+ "4 - Excluir condom�nio\n " 
								+ "5 - Sair\n "
						));

				switch (opcao) {
				case 1:
					JOptionPane.showConfirmDialog(null,
							"Para cadastrar um condom�nio informe os dados a seguir");

					String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do condom�nio : ");
					String nome = JOptionPane.showInputDialog("Digite o nome do condom�nio");
					String end = JOptionPane.showInputDialog("Digite endere�o do condom�nio");
					String caracteristicas = JOptionPane.showInputDialog("Digite as carater�sticas que o condom�nio possui:");
					String nomeSindico = JOptionPane.showInputDialog("Digite o nome do s�ndico:");

					try {
						fachada.cadastrarClienteCondominio(cnpj, nome, end, caracteristicas, nomeSindico);
						JOptionPane.showConfirmDialog(null, "Condom�nio Cadastrado.");

					} catch (CondominioJaCadastradoException e) {

						JOptionPane.showConfirmDialog(null, e.getMessage());
					}

					break;

				case 2:

					break;

				case 4:

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
