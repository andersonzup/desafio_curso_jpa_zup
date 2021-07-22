package br.com.zup.bootcamp.teste;

import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.Avaliacao;

public class SalvarAvaliacaoTeste {

	public static void main(String[] args) {
		FabricaDeConexao conexao = new FabricaDeConexao();
		
		Aluno aluno = new Aluno();
		aluno.setId(5L);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setTitulo("Spring");
		avaliacao.setDescricao("Avaliação Spring");
		
		conexao.salvarAvaliacao(avaliacao);
		
	}

}
