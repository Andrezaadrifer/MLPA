
public class Produto {
	private String nome;
	private int cod; 
	private double pre�ocompra;
	private double pre�ovenda;
	private int qtdestoque;
	
	public Produto(String nome,int cod,double pre�ocompra,double pre�ovenda,int qtdestoque){
		this.nome= nome;
		this.cod = cod;
		this.pre�ocompra= pre�ocompra;
		this.pre�ovenda= pre�ovenda;
		this.qtdestoque= qtdestoque;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome= nome;
	}
	public int getCod(){
		return this.cod;
	}
	public void setCod( int cod){
		this.cod = cod;
	}
	public double getPre�ocompra(){
		return this.pre�ocompra;
	}
	public void setPre�ocompra( double pre�ocompra){
		this.pre�ocompra= pre�ocompra;
	}
	public double getPre�ovenda(){
		return this.pre�ovenda;
	}
	public void setPre�ovenda(double pre�ovenda){
		this.pre�ovenda = pre�ovenda;
	}
	public int getQtdestoque(){
		return this.qtdestoque;
	}
	public void setQtdestoque( int qtdestoque){
		this.qtdestoque=qtdestoque;
	}
	public String toString(){
		return "Produto: "+ getNome();
	}
}
