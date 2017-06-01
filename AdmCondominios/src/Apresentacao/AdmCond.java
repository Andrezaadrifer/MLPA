package Apresentacao;

import javax.swing.JOptionPane;

import Excecoes.CondominioInvalidoException;
import Excecoes.CondominioJaCadastradoException;
import Excecoes.ListaVaziaCondominiosException;

public class AdmCond {

	public static void main(String[] args) throws CondominioInvalidoException{

		FachadaAdmCond fachada = new FachadaAdmCond();

		int opcao = 0;

		while (opcao != 5) {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(

						"0 - Imprimir condomínios cadastrados\n "
								+ "1 - Inserir condomínio\n " 
								+ "2 - Consultar condomínio\n " 
								+ "3 - Aterar Dados do condomínio\n "
								+ "4 - Excluir condomínio\n " 
								+ "5 - Sair\n "
						));

				switch (opcao) {
				case 0:

					try {
						fachada.imprimirCondominios();
						JOptionPane.showConfirmDialog(null, "Acabou.");
						break;
					} catch (ListaVaziaCondominiosException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;
				case 1:
					JOptionPane.showConfirmDialog(null,
							"Para cadastrar um condomínio informe os dados a seguir");

					String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do condomínio : ");

					try {
						fachada.existeCond(cnpj);
						String nome = JOptionPane.showInputDialog("Digite o nome do condomínio");
						String end = JOptionPane.showInputDialog("Digite endereço do condomínio");
						String caracteristicas = JOptionPane.showInputDialog("Digite as caraterísticas que o condomínio possui:");
						String nomeSindico = JOptionPane.showInputDialog("Digite o nome do síndico:");
						fachada.cadastrarCondominio(cnpj, nome, end, caracteristicas, nomeSindico);
						JOptionPane.showConfirmDialog(null, "Condomínio Cadastrado.");

					} catch (CondominioJaCadastradoException e) {

						JOptionPane.showConfirmDialog(null, e.getMessage());
					} catch (CondominioCnpjNullException e) {

						JOptionPane.showConfirmDialog(null, e.getMessage());
					}

					break;
				case 2:
					String cnpjj = JOptionPane.showInputDialog("Digite CNPJ para consultar um condomínio: ");

					try {
						fachada.consultarCond(cnpjj);
						break;
					} catch ( CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;

				case 3:
					String cnpj2 = JOptionPane.showInputDialog("Digite o CNPJ do condomínio : ");
					String nome2 = JOptionPane.showInputDialog("Digite o nome do condomínio");
					String end2 = JOptionPane.showInputDialog("Digite endereço do condomínio");
					String caracteristicas2 = JOptionPane.showInputDialog("Digite as caraterísticas que o condomínio possui:");
					String nomeSindico2 = JOptionPane.showInputDialog("Digite o nome do síndico:");

					try {
						fachada.alterarCondominio(cnpj2, nome2, end2, caracteristicas2, nomeSindico2);
						JOptionPane.showConfirmDialog(null, "Condomínio Alterado!");

					} catch (CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}

					break;

				case 4:
					JOptionPane.showConfirmDialog(null,"Para excluir uma conta informe:" 
							+ "\n Número do CNPJ ");
					String numCNPJ =(JOptionPane.showInputDialog("N° da CNPJ:"));

					try {
						fachada.excluirCondominio(numCNPJ);
					} catch (CondominioInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
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
