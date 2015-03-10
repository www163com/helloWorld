/*
 * www.dyr.com
 * Copyright (c) 2014 All Right Reserved.
 *    版权					                   保留
 */
/**
 * 
 */
package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Project: Hibernte_API Package: util FileName: HibernateUtil.java
 * Comments(意见): JDK Version: Author:谢洪章 Create Date: 2015-3-6下午4:54:11 Modified
 * By(修改人):Casper Modified Time(修改时间): What is Modified: Version(版本):
 */
public class HibernateUtil {
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure();
			ServiceRegistry sreg = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			return cfg.buildSessionFactory(sreg);
		} catch (Throwable ex) {
			// TODO: handle exception
			System.out.println("Initial SessionFacory creation faild!");
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
