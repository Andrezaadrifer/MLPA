package Apresentacao;

import javax.swing.JOptionPane;

import Cliente.Cliente;
import Excecoes.ClienteInvalidoException;
import Excecoes.ClienteJaCadastradoException;
import Excecoes.ContaInvalidaException;
import Excecoes.SaldoInsuficienteException;
import Excecoes.ValorInvalidoException;

public class Banco {

	public static void main(String[] args) throws ContaInvalidaException {

		FachadaBanco fachada = new FachadaBanco();

		int opcao = 0;

		while (opcao != 14) {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Cadastrar Cliente\n " 
								+ "2 - Listar Clientes\n " 
								+ "3 - Atualizar Dados de Clientes\n "
								+ "4 - Abrir Conta Corrente\n " 
								+ "5 - Abrir Conta Poupança\n "
								+ "6 - Abrir Conta Bonificada\n " 
								+ "7 - Consultar Saldo\n " 
								+ "8 - Realizar Saque\n "
								+ "9 - Realizar deposito\n " 
								+ "10 - Realizar Tranferencia\n " 
								+ "11 - Reder Juros\n "
								+ "12 - Reder Bonus\n " 
								+ "13 - Encerar Conta\n " 
								+ "14 - Finalizar Sistema"));

				switch (opcao) {
				case 1:
					//Cadastrar Cliente
					JOptionPane.showConfirmDialog(null,
							"Para cadastrar um cliente informe:" + "\n CPF, NOME, e DATA DE NASCIMENTO");

					String cpf = JOptionPane.showInputDialog("Digite o cpf do Cliente");
					String nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
					String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento do Cliente");

					try {
						fachada.cadastrarCliente(cpf, nome, dataNasc);
						JOptionPane.showConfirmDialog(null, "Cliente Cadastro.");

					} catch (ClienteJaCadastradoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}

					break;

				case 2:
					//Listar Clientes
					fachada.imprimirCliente();
					break;

				case 3:
					//Atualizar Dados de Clientes
					String cpf3 = JOptionPane.showInputDialog("Digite o cpf do Cliente");
					String nome3 = JOptionPane.showInputDialog("Digite o nome do Cliente");
					String dataNasc3 = JOptionPane.showInputDialog("Digite a data de nascimento do Cliente");

					try {
						fachada.alterarCliente(cpf3, nome3, dataNasc3);
						JOptionPane.showConfirmDialog(null, "Cliente Alterado");

					} catch (ClienteInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;

				case 4:
					//Abrir Conta Corrente

					String cpf4 = JOptionPane.showInputDialog("Digite o cpf do Cliente");

					try{
						Cliente titular = fachada.consultaCliente(cpf4);
						double valor = Double
								.parseDouble(JOptionPane.showInputDialog("Digite o valor de abertura da Conta"));

						fachada.inserirConta(titular, valor);
						JOptionPane.showConfirmDialog(null, "Conta corrente aberta");
					}catch(ValorInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}catch(ClienteInvalidoException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;

				case 5:

					String cpf5 = JOptionPane.showInputDialog("Digite o cpf do Cliente");
					double valor5 = Double
							.parseDouble(JOptionPane.showInputDialog("Digite o valor de abertura da Conta"));

					Cliente titular5 = fachada.consultaCliente(cpf5);

					fachada.inserirContaPoupanca(titular5, valor5);
					break;
				case 6:

					String cpf6 = JOptionPane.showInputDialog("Digite o cpf do Cliente");
					double valor6 = Double
							.parseDouble(JOptionPane.showInputDialog("Digite o valor de abertura da Conta"));

					Cliente titular6 = fachada.consultaCliente(cpf6);

					fachada.inserirContaBonificada(titular6, valor6);
					break;

				case 7:
					//Consultar Saldo
					int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite a conta do Cliente"));

					try {
						JOptionPane.showConfirmDialog(null, "Saldo atual: R$" + fachada.consultarSaldo(conta));

					} catch (ContaInvalidaException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;

				case 8:
					//					realizar o saque
					JOptionPane.showConfirmDialog(null,
							"Para realizar o saque informe:" + "\n -Número da conta, e \n-valor para o saque.");
					int numConta = Integer.parseInt(JOptionPane.showInputDialog("N° conta:"));
					double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor: R$"));

					try{
						fachada.saqueConta(numConta, valorSaque);
						JOptionPane.showConfirmDialog(null, "Saque efetuado com sucesso");
					}catch(ContaInvalidaException e) {
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}catch(SaldoInsuficienteException e){
						JOptionPane.showConfirmDialog(null, e.getMessage());
					}
					break;

				case 9:
					JOptionPane.showConfirmDialog(null,
							"Para realizar o deposito informe:" + "\n -Número da conta e o \n-valor para deposito");

					int numConta9 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
					double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite valor para o deposito:"));


					fachada.depositoConta(numConta9, valorDeposito);
					JOptionPane.showConfirmDialog(null, "Deposito efetuado com sucesso");
					break;

				case 10:
					JOptionPane.showConfirmDialog(null,"Para realizar a Transferência informe:" 
							+ "\n Número da conta para retirar e o valor para transferêcia:");

					int numConta1 = Integer.parseInt(JOptionPane.showInputDialog("N° da conta:"));
					double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Valor para o transferêcia: "));

					try {
						fachada.saqueConta(numConta1, valorTransferencia);
						JOptionPane.showConfirmDialog(null, "Saque efetuado com sucesso");

					} catch (SaldoInsuficienteException e) {

						JOptionPane.showConfirmDialog(null, e.getMessage());
					}


					JOptionPane.showConfirmDialog(null,
							"Para continuar a Transferência informe:" + "\n Número da conta que vai receber a transferêcia");
					int numConta2 = Integer.parseInt(JOptionPane.showInputDialog("N° da conta:"));

					fachada.depositoConta(numConta2, valorTransferencia);;
					JOptionPane.showConfirmDialog(null, "Transferência efetuada com sucesso");
					break;

				case 11:

					break;

				case 12:

					break;

				case 13:
					JOptionPane.showConfirmDialog(null,"Para encerrar uma conta informe:" 
							+ "\n Número da conta ");
					int numConta13 = Integer.parseInt(JOptionPane.showInputDialog("N° da conta:"));

					fachada.excluirConta(numConta13);
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
