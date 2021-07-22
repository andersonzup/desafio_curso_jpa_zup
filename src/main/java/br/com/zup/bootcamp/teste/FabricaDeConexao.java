package br.com.zup.bootcamp.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.zup.bootcamp.model.Aluno;
import br.com.zup.bootcamp.model.Avaliacao;
import br.com.zup.bootcamp.model.FormularioAutoCorrecao;
import br.com.zup.bootcamp.model.Resposta;

public class FabricaDeConexao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bootcamp");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

public void salvarAluno(Aluno aluno) {

	entityManager.getTransaction().begin();
	entityManager.persist(aluno);
	entityManager.getTransaction().commit();
	entityManager.close();
}
// Precisa do Id do aluno
public void salvarAvaliacao(Avaliacao avaliacao) {
	entityManager.getTransaction().begin();
	entityManager.persist(avaliacao);
	entityManager.getTransaction().commit();
	entityManager.close();
}
public void salvarResposta(Resposta resposta) {
	// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
	entityManager.persist(resposta);
	entityManager.getTransaction().commit();
	entityManager.close();
}
public void salvarFormulario(FormularioAutoCorrecao formulario) {
	entityManager.getTransaction().begin();
	entityManager.persist(formulario);
	entityManager.getTransaction().commit();
	entityManager.close();
	
}
	

	
	
	

}
