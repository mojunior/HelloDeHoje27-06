package bw.marcos.dao;


import bw.marcos.bean.EmpresaBean;
import bw.marcos.bean.EnderecoBean;
import bw.marcos.bean.PessoaBean;

public class MainCadastro {

	public static void main(String[] args) {
		
		EnderecoBean eBean = new EnderecoBean();
		PessoaBean pBean = new PessoaBean();
		EmpresaBean emBean = new EmpresaBean();
		
		String saida = null;
		
		eBean.setBairro("Porto da Pedra");
		eBean.setCep(2443360);
		eBean.setEndereco("Rua Luxemburgo");
		eBean.setNumero(41);
		
		pBean.setIdade(29);
		pBean.setNome("Marcos");
		pBean.setSexo("Masculino");
		pBean.setSobreNome("Oliveira Junior");
		
		saida = CadastroDao.retornaCadastro(eBean);
		System.out.println(saida);
		saida = CadastroDao.retornaCadastro(pBean);
		System.out.println(saida);
		saida = CadastroDao.retornaCadastro(emBean);
		System.out.println(saida);
	}

	
	
}
