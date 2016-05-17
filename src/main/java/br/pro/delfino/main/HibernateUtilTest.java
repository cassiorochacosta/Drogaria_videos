package br.pro.delfino.main;

import org.hibernate.Session;

import br.pro.delfino.drogria.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDesesaoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDesesaoes().close();
	}
}
