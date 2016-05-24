package br.pro.delfino.drogria.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory fabricaDesesaoes=criarFabricaDesessaoes();

	public static SessionFactory getFabricaDesesaoes() {
		return fabricaDesesaoes;
	}

	private static SessionFactory criarFabricaDesessaoes() {
		try {
			Configuration configuracao = new Configuration().configure();
			//ServiceRegistry registro= new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory();
			return fabrica;

		} catch (Throwable ex) {
			System.err.println("A crição da fabrica de sessões não pode ser criada" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
