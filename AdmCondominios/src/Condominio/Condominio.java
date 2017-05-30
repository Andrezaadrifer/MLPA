package Condominio;

public class Condominio {

	private String CNPJ;
	private String nome;
	private String endereco;
	private String caracteriscas;
	private String nomeSindico;

	@Override
	public String toString() {
		return "Condominio [CNPJ=" + CNPJ + ", nome=" + nome + ", endereco=" + endereco + ", caracteriscas="
				+ caracteriscas + ", nomeSindico=" + nomeSindico + "]";
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCaracteriscas() {
		return caracteriscas;
	}
	
	public void setCaracteriscas(String caracteriscas) {
		this.caracteriscas = caracteriscas;
	}
	
	public String getNomeSindico() {
		return nomeSindico;
	}
	
	public void setNomeSindico(String nomeSindico) {
		this.nomeSindico = nomeSindico;
	}


}
