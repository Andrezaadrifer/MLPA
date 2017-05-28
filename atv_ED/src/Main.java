
public class Main {

	public static void main(String[] args) {
		//Lista é um tipo de referencia do Objeto
		Lista lista = new Lista();
		System.out.println(lista.tamanho());
		
		// -------------------------------------------------
		// Depois de criar o parametro de nº 6
		Contato contato = new Contato();
		contato.nome = "Luciano";
		contato.telefone = "988550258";
		
		lista.inserir(contato);
		System.out.println(lista.tamanho());
		
		// --------------------------------------------------
		
		
		Contato contato2 = new Contato();
		contato2.nome = "Kaio";
		contato2.telefone = "988550258";
		
		lista.inserir(contato2);
		
		Contato contato3 = new Contato();
		contato3.nome = "Paulo";
		contato3.telefone = "988550258";
		
		lista.inserirP(contato3,1);
		//lista.imprimir();
	
		
		// Buscando um contato pelo número de sua posição
		//System.out.println(lista.buscar(2).nome);
		
		// Apagando um nome na lista
		lista.apagar(1);
		//lista.imprimir();
		
		// Removendo o nome de uma lista
		lista.remover(contato2);
		//lista.imprimir();
		// Criando a segunda lista para poder concatenar com a primeira e inserindo o contato5 para testar
		Lista lista2=new Lista();
		Contato contato5=new Contato();
		contato5.nome="teste";
		contato5.telefone="1876518";
		lista2.inserir(contato5);
		lista.concatenar(lista2);
		lista.imprimir();
	
	}
	

}
