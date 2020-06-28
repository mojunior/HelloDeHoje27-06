package bw.marcos.bean;

import java.io.Serializable;

public class EnderecoBean implements Serializable {

	/**
	 * Bean de Endereço
	 * 
	 * @author Marcos Junior
	 * @category Bean
	 * 
	 */
	private static final long serialVersionUID = 3380317231098457826L;
	private String endereco;
	private int numero;
	private String bairro;
	private int cep;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

}
