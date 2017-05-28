
public class Produto {
	private String nome;
	private int cod; 
	private double preçocompra;
	private double preçovenda;
	private int qtdestoque;
	
	public Produto(String nome,int cod,double preçocompra,double preçovenda,int qtdestoque){
		this.nome= nome;
		this.cod = cod;
		this.preçocompra= preçocompra;
		this.preçovenda= preçovenda;
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
	public double getPreçocompra(){
		return this.preçocompra;
	}
	public void setPreçocompra( double preçocompra){
		this.preçocompra= preçocompra;
	}
	public double getPreçovenda(){
		return this.preçovenda;
	}
	public void setPreçovenda(double preçovenda){
		this.preçovenda = preçovenda;
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
