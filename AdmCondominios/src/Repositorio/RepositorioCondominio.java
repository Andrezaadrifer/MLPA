//package Repositorio;
//
//import java.util.ArrayList;
//
//import javax.swing.JOptionPane;
//
//import Cliente.Cliente;
//import Condominio.Condominio;
//
//
//public class RepositorioCondominio {
//	
//	static ArrayList<Condominio> clientes = new ArrayList<Condominio>();
//	
//	public void cadastrarCliente(Condominio cliente){
//		clientes.add(cliente);
//	}
//	
//	public boolean existeCliente(String cpf){
//		boolean f = true;
//		for(Condominio c : clientes){
//			if(cpf.equals(c.getCpf())){
//				f = false;
//				
//				return f;
//			}
//		}
//		return f;
//	}
//	
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
//
//}
