
public class Pessoa {
	private String nome;
	private String tel;
	private String email;
	
	public Pessoa(String nome, String tel, String email){
		this.nome= nome;
		this.tel= tel;
		this.email= email;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome( String nome){
		this.nome= nome;
	}
	public String getTel(){
		return this.tel;
	}
	public void setTel(String tel){
		this.tel= tel;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email= email;
	}
	public String toString(){
		return "Nome:"+getNome()+"\nTel:"+getTel()+"\nEmail:"+getEmail()+"\n";
	}
}
