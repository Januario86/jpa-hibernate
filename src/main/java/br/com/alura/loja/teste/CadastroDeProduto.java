package br.com.alura.loja.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Produto celular = new Produto();
		celular.setNome("Xiomi Redmi");
		celular.setDescricao("Top");
		celular.setPreco(new BigDecimal("800"));
		
		EntityManager em = JPAUtil.getEntityMaanger();
		
		ProdutoDao dao = new ProdutoDao(em);
		
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
		
		
	}
}
