
public class Lista {
	
	//Iniciando as variaveis das classes - lista
	// private é para encapsular os objetos dessa classe, para que só essa classe tem acesso a esse objeto
	private Contato[] contatos = new Contato[10];
	private int cont = 0;
	
	// verificando se a lista esta vazia, quando eu uso boolean ele sempre retornará true ou false,
	// por isso não preciso usar "if"
	public boolean vazia(){
		return cont==0;
	}
	// na variavel cont==contato.length (length retorna o tamanho do vetor, caso aumente o 10 ele,
	// o legth retornará o tamnaho que estiver na memoria, por isso não se usa con==contato[10] 
	public boolean cheia(){
		return cont==contatos.length;
	}
	// retornar o espaço que estou ocupando do vetor
	public int tamanho(){
		return cont;
	}
	// Para inserir um contato, preciso saber se a lista esta cheia e uso o tipo "Contato"
	// o parametro usei c, e o metodo "cheia"
	public boolean inserir(Contato c){
		if(cheia()){
			cresTamanho();
			}
		contatos[cont]=c;
		cont++;
		return true; // parametro nª 6
	}
	
	// Mostrar os contatos da lista
	public void imprimir(){
		for(int i = 0; i<cont;i++){
			System.out.println(contatos[i].nome+"\n"+contatos[i].telefone);
		}
	}
	
	public boolean inserirP(Contato c, int posicao){
		if(cheia()){
			return false;
		}
//		deslocaDireita(posicao);
//		contatos[posicao]=c;
//		cont++;
//      chamar o método inserido abaixo
		
		deslocaDireita(posicao);
		contatos[posicao]=c;
		cont++;
		return true;
				
		}
	// Criando o método desloca a direita
		private void deslocaDireita (int posicao){
			for(int i=cont;i>posicao;i--){
				contatos[i]=contatos[i-1];
			}
		}
	
	// Buscar
	
		public Contato buscar(int posicao){
			if(posicao<0 || posicao>=cont){
				return null;
			}
			
			return contatos[posicao];
		}
		// Apagando um nome na lista
		public boolean apagar(int pos){
			if(pos<0 || pos>=cont){
				return false;
			}
			deslocaEsquerda (pos);
			cont--;
			return true;
		}
		
		private void deslocaEsquerda (int posicao){
			for (int i = posicao; i<cont-1;i++){
				contatos[i]=contatos[i+1];
			}
		}
		
		// remover um contato
		public boolean remover(Contato c){
			for(int i = 0;i<cont;i++){
				if(contatos[i]==c){
					apagar(i);
					return true;
				}
			}
			return false;
		}
		
		// Crescer o tamanho do vetor
		private void cresTamanho(){
			Contato[] auxiliar = new Contato[contatos.length*2];
			for (int i=0; i<contatos.length;i++){
				auxiliar [i] = contatos[i];
			}
			contatos=auxiliar;
		}
		
		public void concatenar(Lista aparelho2){
			if(contatos.length-cont<aparelho2.tamanho()){
				cresTamanho();
			}
			for(int i=0; i<aparelho2.tamanho();i++){
				inserir(aparelho2.contatos[i]);
			}
			
		}
	}
