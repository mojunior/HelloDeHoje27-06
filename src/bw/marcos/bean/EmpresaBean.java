package bw.marcos.bean;

import java.io.Serializable;

public class EmpresaBean implements Serializable {

	/**
	 * Bean de Empresa
	 * 
	 * @author Marcos Junior
	 * @category Bean
	 * 
	 */
	private static final long serialVersionUID = -4747857316441840938L;
	private String nome;
	private String endereco;

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

}
