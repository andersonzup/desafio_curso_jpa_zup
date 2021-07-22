package br.com.zup.bootcamp.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.Avaliacao;
import br.com.zup.bootcamp.model.Resposta;

public class ListarRespostaPorAluno {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bootcamp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setId(1L);
		
		String jpql = "select R from Resposta R join R.aluno AL where AL = :pAluno ";

		TypedQuery<Resposta> query =  entityManager.createQuery(jpql, Resposta.class);
		
		query.setParameter("pAluno", aluno);
		
		List<Resposta> resultList = query.getResultList();
		
		for (Resposta res : resultList) {
			Avaliacao avaliacao = res.getAvaliacao();
			System.out.println("Resposta da avaliação " + avaliacao.getTitulo() + " : ");
			System.out.println("- " + res.getResposta());
			

		}

	}

}
