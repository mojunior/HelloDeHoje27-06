package bw.marcos.dao;

import bw.marcos.bean.EnderecoBean;
import bw.marcos.bean.PessoaBean;

public class CadastroDao {

	final static String VAZIO = "Falha no processo: Não foram retornados dados validos";
	final static String ERRO = "Falha no processo: Dados incorretos";

	public static String retornaCadastro(Object obj) {

		if (obj instanceof PessoaBean) {

			PessoaBean pBean = (PessoaBean) obj;
			StringBuilder saida = new StringBuilder();
			try {
				saida.append("Saída de Cadastro \n");
				saida.append("Idade: " + pBean.getIdade());
				saida.append("\n");
				saida.append("Nome: " + pBean.getNome());
				saida.append("\n");
				saida.append("Sexo: " + pBean.getSexo());
				saida.append("\n");
				saida.append("Sobrenome: " + pBean.getSobreNome());
			} catch (Exception e) {
				System.out.println("Erro ao processar a informação " + e);
				return ERRO;
			}

			return saida.toString();

		} else if (obj instanceof EnderecoBean) {

			EnderecoBean eBean = (EnderecoBean) obj;
			StringBuilder saida = new StringBuilder();
			try {
				saida.append("Saída de Endereço \n");
				saida.append("Bairro: " + eBean.getBairro());
				saida.append("\n");
				saida.append("Cep: " + eBean.getCep());
				saida.append("\n");
				saida.append("Endereço: " + eBean.getEndereco());
				saida.append("\n");
				saida.append("Número: " + eBean.getNumero());

				return saida.toString();

			} catch (Exception e) {

				System.out.println("Erro ao processar a informação " + e);
				return ERRO;
			}

		}
		return VAZIO;

	}

}
