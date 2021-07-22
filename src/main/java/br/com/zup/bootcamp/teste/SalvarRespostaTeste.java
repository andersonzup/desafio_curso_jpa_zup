package br.com.zup.bootcamp.teste;

import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.Avaliacao;
import br.com.zup.bootcamp.model.Resposta;

public class SalvarRespostaTeste {

	public static void main(String[] args) {
		FabricaDeConexao conexao = new FabricaDeConexao();
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setId(1L);
		Aluno aluno = new Aluno();
		aluno.setId(3L);
		
		
		Resposta resposta = new Resposta();
		resposta.setResposta("Essa é a resposta do mentor");
		resposta.setAvaliacao(avaliacao);
		resposta.setAluno(aluno);
		
		conexao.salvarResposta(resposta);

	}

}
