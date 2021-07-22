package br.com.zup.bootcamp.teste;

import br.com.zup.bootcamp.model.Aluno;

public class SalvarAlunoTeste {
	public static void main(String[] args) {
		FabricaDeConexao conexao = new FabricaDeConexao();
		Aluno aluno = new Aluno();
		aluno.setNome("MArco");
		aluno.setEmail("marco.santana@zup.com.br");
		aluno.setIdade(34);
		
		conexao.salvarAluno(aluno);

		
	}
}
