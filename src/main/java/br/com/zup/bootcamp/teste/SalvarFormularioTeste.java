package br.com.zup.bootcamp.teste;

import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.Avaliacao;
import br.com.zup.bootcamp.model.FormularioAutoCorrecao;

public class SalvarFormularioTeste {

	public static void main(String[] args) {
	FabricaDeConexao conexao = new FabricaDeConexao();
	Avaliacao avaliacao = new Avaliacao();
	avaliacao.setId(5L);
	Aluno aluno = new Aluno();
	aluno.setId(4L);
	
	FormularioAutoCorrecao formulario = new FormularioAutoCorrecao();
	formulario.setNota(7);
	formulario.setAvaliacao(avaliacao);
	formulario.setAluno(aluno);
	
	conexao.salvarFormulario(formulario);
	
	
	}

}
