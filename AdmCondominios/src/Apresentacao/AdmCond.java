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
						"1 - Inserir condomínio\n " 
								+ "2 - Consultar condomínio\n " 
								+ "3 - Aterar Dados do condomínio\n "
								+ "4 - Excluir condomínio\n " 
								+ "5 - Sair\n "
						));

				switch (opcao) {
				case 1:
					JOptionPane.showConfirmDialog(null,
							"Para cadastrar um condomínio informe os dados a seguir");

					String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do condomínio : ");
					String nome = JOptionPane.showInputDialog("Digite o nome do condomínio");
					String end = JOptionPane.showInputDialog("Digite endereço do condomínio");
					String caracteristicas = JOptionPane.showInputDialog("Digite as caraterísticas que o condomínio possui:");
					String nomeSindico = JOptionPane.showInputDialog("Digite o nome do síndico:");

					try {
						fachada.cadastrarClienteCondominio(cnpj, nome, end, caracteristicas, nomeSindico);
						JOptionPane.showConfirmDialog(null, "Condomínio Cadastrado.");

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
