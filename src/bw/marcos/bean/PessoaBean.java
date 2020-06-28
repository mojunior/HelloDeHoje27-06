package bw.marcos.bean;

import java.io.Serializable;

public class PessoaBean implements Serializable{
	
	/**
	 * Bean de Cadastro
	 * @author Marcos Junior
	 * @category Bean
	 * 
	 */
	private static final long serialVersionUID = -8519182264853042254L;
	private String nome;
	private String sobreNome;
	private int idade;
	private String sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
