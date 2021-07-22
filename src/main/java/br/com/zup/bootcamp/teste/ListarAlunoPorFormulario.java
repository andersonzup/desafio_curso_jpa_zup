package br.com.zup.bootcamp.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.FormularioAutoCorrecao;

public class ListarAlunoPorFormulario {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bootcamp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		FormularioAutoCorrecao formularioAutoCorrecao = new FormularioAutoCorrecao();
		formularioAutoCorrecao.setId(3L);
		
		
		String jpql = "select FO from FormularioAutoCorrecao FO where FO.id = :pId";
		
		
		
		TypedQuery<FormularioAutoCorrecao> query =  entityManager.createQuery(jpql, FormularioAutoCorrecao.class);

		query.setParameter("pId", formularioAutoCorrecao.getId());
		
		List<FormularioAutoCorrecao> resultList = query.getResultList();
		
		for (FormularioAutoCorrecao fm : resultList) {
			Aluno aluno = fm.getAluno();
			System.out.println("Nome do Aluno: " + aluno.getNome());
		}
		


	}

}
