package br.pro.delfino.drogria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDesesaoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDesesaoes().close();
		
	}

}
