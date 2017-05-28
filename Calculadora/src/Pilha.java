
public class Pilha {
	int n=0;
	No topo;
	
	public boolean isVazia(){
		return topo == null ;}
	
	public int tamanho(){
		return n;}
	
	public void inserir(Integer dado){
		No novo = new No();
		novo.dado = dado;
		novo.prox=topo;
		topo=novo;
		n++;
		
	}
	public void imprimir(){
		if(isVazia()){
			System.out.println("Pilha vazia");
		}
		No aux = topo;
		while(aux!=null){
			System.out.println(aux.dado);
		}
	}
	public Integer remover(){
		if(isVazia()){
			return null;
		}
		Integer dado= topo.dado;
		topo = topo.prox;
		n--;
		return dado;}
	
	public void calcula() {  
          
            switch (elementos[topo]) {  
              
                case '+': { resultado = v1.doubleValue() + v2.doubleValue(); break; }  
                case '-': { resultado = v1.doubleValue() - v2.doubleValue(); break; }  
                case '/': { resultado = v1.doubleValue() / v2.doubleValue(); break; }  
                case '*': { resultado = v1.doubleValue() * v2.doubleValue(); break; }  
                default:{ resultado = 0; break; }  
            }
}

