package Questão_6;

import java.util.Arrays;

public class Agenda {
	
	 private Contato contatos[] = new Contato [10];
	 int totalLista = 0;
	 public void addContato (Contato contato){
	 this.contatos[this.totalLista]= contato;
	 this.totalLista++;
	 }
	 
	 public Contato[] buscarContato(String nome){
		 return contatos;
	 }
	 
	 public Contato[] apagarContato(String nome){
		 return contatos;
	 }
	 
	  public String toString() {
		    return Arrays.toString(contatos);
		  }
}
